package com.turingawardee.minpro.services;

import com.turingawardee.minpro.entities.AwardWinner;

public class AwardeeService {

    public AwardWinner getAllWinners() {
        AwardWinner awardWinners = new AwardWinner(1, "Geoffrey Hinton", "AI", "2020", "Canada", "Google, Vector Institute and University of Toronto, Canada", "geoffrey.jpg", null);
        return awardWinners;
    }
}
