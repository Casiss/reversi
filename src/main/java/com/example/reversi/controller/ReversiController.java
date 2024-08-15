package com.example.reversi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reversi.model.ReversiGame;

@Controller
public class ReversiController {

    private ReversiGame game = new ReversiGame();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("board", game.getBoard().getBoardState());
        model.addAttribute("currentPlayer", game.getCurrentPlayer().getColor());
        return "index";
    }

    @PostMapping("/move")
    public String makeMove(@RequestParam int row, @RequestParam int col, Model model) {
        game.makeMove(row, col);
        model.addAttribute("board", game.getBoard().getBoardState());
        model.addAttribute("currentPlayer", game.getCurrentPlayer().getColor());
        return "index";
    }
}

