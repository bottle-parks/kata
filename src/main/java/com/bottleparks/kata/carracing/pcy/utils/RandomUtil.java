package com.bottleparks.kata.carracing.pcy.utils;

import java.util.Random;

public class RandomUtil {

    private static final int RANDOM_NUMBER_BOUND = 10;
    private static final Random random = new Random();

    public static int getNumber() {
        return random.nextInt(RANDOM_NUMBER_BOUND);
    }
}
