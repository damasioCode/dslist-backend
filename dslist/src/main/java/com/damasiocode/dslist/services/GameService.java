package com.damasiocode.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damasiocode.dslist.dto.GameMinDTO;
import com.damasiocode.dslist.entities.Game;
import com.damasiocode.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = this.gameRepository.findAll();
        
        List<GameMinDTO> data = result.stream()
            .map(GameMinDTO::new)
            .collect(Collectors.toList());

        return data;
    }
}
