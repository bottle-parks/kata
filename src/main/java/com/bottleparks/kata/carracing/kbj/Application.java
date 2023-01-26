package com.bottleparks.kata.carracing.kbj;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        Racing racing = new Racing();
        racing.start();
    }
}
