package org.factoriaf5.legacygamesa.controllers;

import org.factoriaf5.legacygamesa.services.GameService;
import org.factoriaf5.legacygamesa.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GameController {

    private final GameService gameService;
    private GameService games;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    String listGames(Model model) {
        List<Game> books = gameService.allGame();
        model.addAttribute("title", "Game list");
        model.addAttribute("games", games);
        return "games/all";
    }
}