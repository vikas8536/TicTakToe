package com.interview.app;

import com.interview.models.GameType;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver(GameType.TIC_TAC_TOE);
        driver.run();
    }



}
