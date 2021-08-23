package com.medinar.covidwatch.controller;

import com.medinar.covidwatch.domain.InternationalTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.medinar.covidwatch.service.InternationalService;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rommel Medina
 */
@Controller
public class InternationalController {

    @Autowired
    InternationalService internationalService;

    @GetMapping("/international/{country}")
    public String getTotal(
            Model model,
            @PathVariable String country,
            @RequestParam(required = false) boolean yesterday,
            @RequestParam(required = false) boolean twoDaysAgo,
            @RequestParam(required = false) boolean strict,
            @RequestParam(required = false) boolean allowNull
    ) throws Exception {

        InternationalTotal internationalTotal = internationalService
                .getTotal(country, yesterday, twoDaysAgo, strict, allowNull);

        model.addAttribute("flag", internationalTotal.getCountryInfo().getFlag());

        model.addAttribute("cases", internationalTotal.getCases());
        model.addAttribute("deaths", internationalTotal.getDeaths());
        model.addAttribute("recovered", internationalTotal.getRecovered());

        model.addAttribute("active", internationalTotal.getActive());
        model.addAttribute(
                "closed",
                internationalTotal.getDeaths() + internationalTotal.getRecovered()
        );

        float activePercentage = (float) ((Double.valueOf(internationalTotal.getActive()) * 100)
                / Double.valueOf(internationalTotal.getCases()));
        model.addAttribute("activePercentage", activePercentage);

        float recoveredPercentage = (float) ((Double.valueOf(internationalTotal.getRecovered()) * 100) 
                / Double.valueOf(internationalTotal.getCases()));
        model.addAttribute("recoveredPercentage", recoveredPercentage);

        float deathPercentage = (float) ((Double.valueOf(internationalTotal.getDeaths()) * 100) 
                / Double.valueOf(internationalTotal.getCases()));
        model.addAttribute("deathPercentage", deathPercentage);

        model.addAttribute("todayCases", internationalTotal.getTodayCases());
        model.addAttribute("todayRecovered", internationalTotal.getTodayRecovered());
        model.addAttribute("todayDeaths", internationalTotal.getTodayDeaths());

        return "international";
    }
}
