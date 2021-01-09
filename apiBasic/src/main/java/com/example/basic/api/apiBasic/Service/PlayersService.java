package com.example.basic.api.apiBasic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.basic.api.apiBasic.Entity.Players;
import com.example.basic.api.apiBasic.Repository.PlayersRepository;

@Service
@Transactional
public class PlayersService {
    @Autowired
    private PlayersRepository playersRepository;

    public List <Players> getAll(){
        return playersRepository.findAll();
    }

    public void save (Players player) {
        playersRepository.save(player);
    }

    public Players getById(Integer id) {
        return playersRepository.findById(id).get();
    }

    public void deleteById(Integer id){
        playersRepository.deleteById(id);
    }


}
