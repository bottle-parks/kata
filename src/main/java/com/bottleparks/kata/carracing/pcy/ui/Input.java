package com.bottleparks.kata.carracing.pcy.ui;

import java.util.Scanner;

import static com.bottleparks.kata.carracing.pcy.utils.InputUtil.*;
import static com.bottleparks.kata.carracing.pcy.utils.constants.ErrorConstant.NOT_NUMBER;

public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public static String[] getCarNames() {
        final String text = sc.nextLine();

        try {
            final String[] names = splitComma(text);
            checkNames(names);
            duplicationName(names);

            return names;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return getCarNames();
    }

    private static void checkNames(String[] names) {
        for (String name : names) {
            validName(name);
        }
    }

    public static int getTryCount() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(NOT_NUMBER);
        }

        return getTryCount();
    }
}
