package com.bottleparks.kata.carracing.pcy.racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {

    @Test
    void addCar() {
        Racing racing = new Racing();
        racing.addCar("pobi");
        racing.addCar("crong");
        racing.addCar("honux");

        assertThat(racing.getCars().size()).isEqualTo(3);
        assertThat(racing.getCars()).extracting("name").containsExactly("pobi", "crong", "honux");
    }
}
