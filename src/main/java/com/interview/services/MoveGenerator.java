package com.interview.services;

import com.interview.models.Location;

public interface MoveGenerator {
    default int randomInt() {
        return (int) Math.random() * 3;
    }
    default Location nextMove() {
        return new Location(randomInt(), randomInt());
    }
}
