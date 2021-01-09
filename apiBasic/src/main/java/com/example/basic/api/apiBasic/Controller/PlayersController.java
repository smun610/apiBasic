package com.example.basic.api.apiBasic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.api.apiBasic.Entity.Players;
import com.example.basic.api.apiBasic.Service.PlayersService;

@RestController
public class PlayersController {
    @Autowired
    private PlayersService playersService;

    @RequestMapping("/player")
    public List<Players> list() {
        return playersService.getAll();
    }


    @RequestMapping(method = RequestMethod.POST, value = "/player")
    public ResponseEntity<Players> addNewPlayer(@RequestBody Players pl) {
        try {
            System.out.println(pl);
            playersService.save(pl);
            return new ResponseEntity<Players>(pl, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Players>(pl, HttpStatus.NOT_ACCEPTABLE);
        }

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/player/{id}")
    public ResponseEntity<Object> deletePlayer(@PathVariable Integer id) {
        Players pl = playersService.getById(id);

        if (pl != null) {
            playersService.deleteById(id);
            return new ResponseEntity<Object>("DELETE " + pl.getFirstname(), HttpStatus.OK);

        }
        return new ResponseEntity<Object>("Id does not exist", HttpStatus.NOT_FOUND);


    }

    @RequestMapping("/player/{id}")
    public ResponseEntity<Object> getAPlayer(@PathVariable Integer id) {
        try {
            return new ResponseEntity<Object>(playersService.getById(id), HttpStatus.OK);
        } catch (Exception E) {
            return new ResponseEntity<Object>("Id does not exist", HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/player/{id}")
    public ResponseEntity<Object> updatePlayer(@RequestBody Players player, @PathVariable Integer id) {
        Players toUpdate = playersService.getById(id);

        if (toUpdate != null) {
            toUpdate = player;
            toUpdate.setId(id);
            playersService.save(toUpdate);
            return new ResponseEntity<Object>(playersService.getById(id), HttpStatus.OK);
        }
        return new ResponseEntity<Object>("Id does not exist", HttpStatus.NOT_FOUND);
    }


}



