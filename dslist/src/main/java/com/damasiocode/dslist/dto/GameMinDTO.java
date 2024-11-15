package com.damasiocode.dslist.dto;

import com.damasiocode.dslist.entities.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer gameYear;
    private String imgUrl;
    private String shortDescription;

     public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.gameYear = game.getGameYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    // public GameMinDTO(Game item) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}
