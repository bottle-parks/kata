package com.bottleparks.kata.carracing.kbj;

import java.util.Random;

public class RandomGenerator {

    public static boolean overFour() {
     Random rn = new Random();
        int num = rn.nextInt();
        if(num >=4)
            return true;
        return false;
    }
}
