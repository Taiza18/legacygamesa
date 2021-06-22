package org.factoriaf5.legacygamesa.controllers;

import org.factoriaf5.legacygamesa.models.Game;
import org.factoriaf5.legacygamesa.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Controller
public class GameController {
    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) { this.gameService = gameService;
    }



    @GetMapping("/games/new")
    public String newGame(Model model){
        Game game = new Game();
        model.addAttribute("game", game);
        model.addAttribute("title","Create new games");
        return "games/edit";
    }

    @PostMapping("games/new")
   public String addGame(@ModelAttribute Game game, @RequestParam("image") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        game.setPhoto(fileName);
        gameService.save(game);
        String upLoadDir = "game-photo/" + game.getId();
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return "redirect:/home";
    }

    @GetMapping("games/edit/{id}")
    public String editGame(Model model, @PathVariable Long id){
        Game game = gameService.findById(id);
        model.addAttribute("game", game);
        model.addAttribute("title", "Edit games");
        return "games/edit";
    }

    @GetMapping("games/delete/{id}")
    public String removeGame(@PathVariable Long id){
        gameService.delete(id);
        return "redirect:/home";
    }

}