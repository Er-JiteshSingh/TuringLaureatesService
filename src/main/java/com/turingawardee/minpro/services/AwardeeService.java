package com.turingawardee.minpro.services;

import com.turingawardee.minpro.dao.AwardeeRepository;
import com.turingawardee.minpro.entities.AwardWinner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardeeService {

    @Autowired
    private AwardeeRepository awardeeRepository;

    //    Get Single Awardee
    public AwardWinner getAwardee(int id) {
        AwardWinner winner = awardeeRepository.findById(id);
        return winner;
    }

    //    Get All Awardees
    public List<AwardWinner> getAllWinners() {

        List<AwardWinner> allWinners = (List<AwardWinner>) awardeeRepository.findAll();

        return allWinners;
    }

    //    Store New Awardee Details
    public AwardWinner createAwardee(AwardWinner awardWinner) {
        AwardWinner saved = awardeeRepository.save(awardWinner);
        return saved;
    }

    //    Delete Awardee Details
    public String removeAwardee(int id) {
        awardeeRepository.deleteById(id);
        return "Deletion Success";
    }

    //    Delete All Awardee Details
    public String removeAllAwardee() {
        awardeeRepository.deleteAll();
        return "Deletion All Data Success";
    }

    //    Update Record
    public String UpdateDetails(AwardWinner awardWinner, int id) {

        AwardWinner winner = awardeeRepository.findById(id);

        winner.setName(awardWinner.getName());
        winner.setCountry(awardWinner.getCountry());
        winner.setYear(awardWinner.getYear());
        winner.setAffiliation(awardWinner.getAffiliation());
        winner.setDescription(awardWinner.getDescription());
        winner.setImage(awardWinner.getImage());

        awardeeRepository.save(winner);
        return "Updation Success";
    }
}
