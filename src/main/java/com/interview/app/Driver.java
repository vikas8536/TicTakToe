package com.interview.app;

import com.interview.game.Game;
import com.interview.game.TicTacToe;
import com.interview.models.Board;
import com.interview.models.GameType;
import com.interview.models.Player;
import com.interview.services.Input;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    GameType gameType;
    Game game;
    Input input;

    public Driver(GameType gameType) {
        this.gameType = gameType;
    }

    public void run() {
        Board board = new Board(3,3);

        List<Player> players = new ArrayList<>();
        TicTacToe ticTacToe = new TicTacToe();
    }
}
