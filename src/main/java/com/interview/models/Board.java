package com.interview.models;

public class Board {
    private int[][] grid;
    private int rows;
    private int columns;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.grid = new int[rows][columns];
        init();
    }
    private void init() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                this.setValue(-1,new Location(i,j)) ;
            }
        }
    }

    public boolean canPlace(Location location) {
        return true;
    }

    public boolean setValue(int value, Location location) {
        if(!canPlace( location)) {
            return false;
        }
        this.grid[location.getI()][location.getJ()] = value;
        return true;
    }
    public int getValue(int row, int column) {
        return this.grid[row][column];
    }

    public void printBoard() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(this.getValue(i,j) + " ");
            }
            System.out.println();
        }
    }
}
