package com.interview.game;

import com.interview.models.Board;
import com.interview.models.Location;
import com.interview.models.Mode;
import com.interview.models.Player;

import java.util.List;

public class TicTacToe implements Game{
    private Board board;
    private int currentPlayerIndex = 0;
    private List<Player> players;

    public TicTacToe(Board board,
                     List<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void moveStep() {
        board.printBoard();
        System.out.println("Move for player " + (currentPlayerIndex + 1));

        Player currentPlayer = players.get(currentPlayerIndex);

        Location currentLocation = currentPlayer.getMove();
        while(!board.canPlace(currentLocation)) {
            System.out.println("Move Is not Valid");
            currentLocation = currentPlayer.getMove();
        }
        board.setValue(currentPlayerIndex, currentLocation);
        currentPlayerIndex = currentPlayerIndex == 0 ? 1 : 0;
    }

    @Override
    public boolean isGameFinished() {
        return false;
    }

    @Override
    public Player getWinner() {
        return players.get(currentPlayerIndex);
    }
}
