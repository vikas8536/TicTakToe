package com.interview;

import com.interview.models.Board;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testGrid() {
        Board board = new Board(3,3);
        assertThat(board.getValue(0,0), is(-1));
    }
}