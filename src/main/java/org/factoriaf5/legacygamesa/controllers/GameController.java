package org.factoriaf5.legacygamesa.controllers;

import org.factoriaf5.legacygamesa.models.Game;
import org.factoriaf5.legacygamesa.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class GameController {
    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) { this.gameService = gameService;
    }



    @GetMapping("/new")
    public String getForm(Model model){
        Game game = new Game();
        model.addAttribute("game", game);
        model.addAttribute("title","Create new games");
        return "games/new";
    }

    @PostMapping("/new")
   public String addGame(@ModelAttribute Game game) {
        gameService.save(game);
        return "redirect:/";
    }

    @GetMapping("edit/{id}")
    public String editGame(Model model, @PathVariable Long id){
        Game game = gameService.findById(id);
        model.addAttribute("game", game);
        model.addAttribute("title", "Edit games");
        return "games/new";
    }

    @GetMapping("/delete/{id}")
    public String removeGame(@PathVariable Long id){
        gameService.delete(id);
        return "redirect:/games";
    }

}