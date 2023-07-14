package org.launchcode.CovidRestApi.controllers;

import org.launchcode.CovidRestApi.dto.AlertStatus;
import org.launchcode.CovidRestApi.dto.SummaryData;
import org.launchcode.CovidRestApi.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/india/")
public class AlertController {

    @Autowired
    private AlertService alertService;

    @GetMapping("/{state}")
    public AlertStatus getAlertAboutState(@PathVariable String state){

        return alertService.getAlertAboutState(state);
    }

    @GetMapping("/summary")
    public SummaryData getOverAllSummary(){

        return alertService.getOverAllSummary();
    }
}