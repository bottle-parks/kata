package com.bottleparks.kata.carracing.pcy.ui;

import java.util.Map;

import static com.bottleparks.kata.carracing.pcy.utils.constants.OutputConstant.*;

public class Output {

    private static final String BAR = "-";
    private static final String DELIMITER = " : ";

    public static void printInputCarName() {
        System.out.println(INPUT_CAR_NAME);
    }

    public static void printInputTryCount() {
        System.out.println(INPUT_TRY_COUNT);
    }

    public static void printPlayResult(final Map<String, Integer> cars) {
        System.out.println(PLAY_RESULT);
        printPlay(cars);
    }

    private static void printPlay(Map<String, Integer> cars) {
        for (Map.Entry<String, Integer> car : cars.entrySet()) {
            System.out.println(makeCarState(car.getKey(), car.getValue()));
        }
        System.out.println();
    }

    private static String makeCarState(final String name, final int position) {
        return name + DELIMITER + makePositionBar(position);
    }

    private static String makePositionBar(final int position) {
        return BAR.repeat(position);
    }

    public static void printResult(final String carNames) {
        System.out.println(carNames + FINAL_WINNER);
    }
}
