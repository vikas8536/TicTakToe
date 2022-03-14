package com.interview.services;

import java.util.Scanner;

public class ScannerInput implements Input{
    public int readInt() {
        Scanner myInput = new Scanner(System.in);
        return myInput.nextInt();
    }
}
