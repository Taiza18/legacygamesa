package org.factoriaf5.legacygamesa.services;

import org.factoriaf5.legacygamesa.models.Game;
import org.factoriaf5.legacygamesa.models.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> allBooks() {
        List<Game> allGame = (List<Game>) gameRepository.findAll();
        return allGame;
    }

    public void save(Game game) {
        gameRepository.save(game);
    }

    public Game findById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        gameRepository.deleteById(id);
    }

    public List<Game> allGame() {
        return null;
    }
}
