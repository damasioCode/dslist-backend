package com.damasiocode.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damasiocode.dslist.dto.GameMinDTO;
import com.damasiocode.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;
    	
    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = this.gameService.findAll();
        return result;
    }
}
