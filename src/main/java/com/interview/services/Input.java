package com.interview.services;

import java.util.Scanner;

public interface Input {
    default int readInt() {
        Scanner myInput = new Scanner(System.in);
        return myInput.nextInt();
    }
}
