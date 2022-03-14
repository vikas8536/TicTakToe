package com.interview.game;

import com.interview.models.Player;

public interface Game {
    boolean isGameFinished();
    Player getWinner();

    void moveStep();
}
