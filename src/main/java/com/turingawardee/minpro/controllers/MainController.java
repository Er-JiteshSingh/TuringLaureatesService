package com.turingawardee.minpro.controllers;

import com.turingawardee.minpro.entities.AwardWinner;
import com.turingawardee.minpro.services.AwardeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/awardees")
    public AwardWinner allAwardees() {

        return new AwardeeService().getAllWinners();
    }
}