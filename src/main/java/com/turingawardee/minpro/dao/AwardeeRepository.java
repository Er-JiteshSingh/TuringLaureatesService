package com.turingawardee.minpro.dao;

import com.turingawardee.minpro.entities.AwardWinner;
import org.springframework.data.repository.CrudRepository;

public interface AwardeeRepository extends CrudRepository<AwardWinner, Integer> {

    AwardWinner findById(int id);

}
