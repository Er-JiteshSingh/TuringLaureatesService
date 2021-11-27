package com.turingawardee.minpro.controllers;

import com.turingawardee.minpro.entities.AwardWinner;
import com.turingawardee.minpro.services.AwardeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MainController {

    @Autowired
    private AwardeeService awardeeService;

    @GetMapping("/awardee/{id}")                                        //Endpoint For Getting Single Awardee Details
    public AwardWinner awardee(@PathVariable("id") int id) {
        AwardWinner winner = awardeeService.getAwardee(id);
        return winner;
    }

    @GetMapping("/awardees")                                                //Endpoint For Getting All Awardee Details
    public List<AwardWinner> allAwardees() {
        return awardeeService.getAllWinners();
    }

    @PostMapping("/awardee")                                                //Endpoint For Storing Awardee Details
    public AwardWinner addAwardee(@RequestBody AwardWinner awardeeDetails) {
        AwardWinner saved = awardeeService.createAwardee(awardeeDetails);
        return saved;
    }

    @DeleteMapping("/awardee/{id}")                                   //Endpoint For Delete Single Awardee Details
    public String awardeeDel(@PathVariable("id") int id) {
        return awardeeService.removeAwardee(id);
    }

    @DeleteMapping("/awardee")                                           //Endpoint For Delete All Awardee Details
    public String allAwardeeDel() {
        return awardeeService.removeAllAwardee();
    }

    @PutMapping("/awardee/{id}")                                   //Endpoint For Update Awardee Details
    public String awardeeUpdate(@RequestBody AwardWinner awardWinner, @PathVariable("id") int id) {
        return awardeeService.UpdateDetails(awardWinner, id);
    }
}