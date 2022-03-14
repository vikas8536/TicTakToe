package com.interview.models;

import com.interview.services.MoveGenerator;

public class AIPlayer implements Player{
    private MoveGenerator moveGenerator;

    public AIPlayer(MoveGenerator moveGenerator) {
        this.moveGenerator = moveGenerator;
    }

    @Override
    public Location getMove() {
        return moveGenerator.nextMove();
    }
}
