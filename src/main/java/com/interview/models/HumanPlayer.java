package com.interview.models;

import com.interview.services.Input;

public class HumanPlayer implements Player{

    private Input input;

    public HumanPlayer(Input input) {
        this.input = input;
    }

    @Override
    public Location getMove() {
        //user input for human player;
        int row = input.readInt();
        int column = input.readInt();
        return new Location(row, column);
    }
}
