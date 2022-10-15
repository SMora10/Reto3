package com.usa.misiontic.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.misiontic.reto3.reto3.entities.Score;
import com.usa.misiontic.reto3.reto3.repository.crudRepository.ScoreCrudRepository;


@Repository
public class ScoreRepository {

    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }

    public Optional<Score> getScore(int id){
        return scoreCrudRepository.findById(id);
    }

    public Score save(Score c){
        return scoreCrudRepository.save(c);
    }
    public void delete(Score c){
    scoreCrudRepository.delete(c);
    }
}
