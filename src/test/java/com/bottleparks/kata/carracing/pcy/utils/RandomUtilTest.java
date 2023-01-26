package com.bottleparks.kata.carracing.pcy.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomUtilTest {

    @Test
    void createNumber_한자리_랜덤정수() {
        for (int i = 0; i < 9999; i++) {
            int number = RandomUtil.getNumber();

            assertThat(number >= 0).isTrue();
            assertThat(number < 10).isTrue();
        }
    }
}
