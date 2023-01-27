package com.bottleparks.kata.carracing.pcy.racingcar;

import java.util.Map;

import static com.bottleparks.kata.carracing.pcy.ui.Input.getCarNames;
import static com.bottleparks.kata.carracing.pcy.ui.Input.getTryCount;
import static com.bottleparks.kata.carracing.pcy.ui.Output.*;
import static com.bottleparks.kata.carracing.pcy.utils.RandomUtil.getNumber;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;

public class Game {

    private static final Racing racing = new Racing();

    public static void start() {
        final int tryCount = setting();
        play(tryCount);
        result();
    }

    private static int setting() {
        setCars();
        return setTryCount();
    }

    private static void setCars() {
        printInputCarName();

        for (String name : getCarNames()) {
            racing.addCar(name);
        }
    }

    private static int setTryCount() {
        printInputTryCount();

        return getTryCount();
    }

    private static void play(final int tryCount) {
        printPlayResult(convertToMap());

        for (int i = 0; i < tryCount; i++) {
            racing();
        }
    }

    private static Map<String, Integer> convertToMap() {
        return racing.getCars().stream()
                .collect(toMap(
                        Car::getName,
                        Car::getPosition,
                        (oldValue, newValue) -> newValue
                ));
    }

    private static void racing() {
        for (int i = 0; i < racing.getCars().size(); i++) {
            racing.checkNumberAndMove(i, getNumber());
        }

        printPlayResult(convertToMap());
    }

    private static void result() {
        printResult(racing.getWinningCars().stream()
                .map(Car::getName)
                .collect(joining(", "))
        );
    }
}
