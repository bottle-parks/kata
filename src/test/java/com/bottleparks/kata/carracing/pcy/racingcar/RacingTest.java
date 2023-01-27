package com.bottleparks.kata.carracing.pcy.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {

    Racing racing;

    @BeforeEach
    void setUp() {
        racing = new Racing();
    }

    @Test
    void addCar() {
        racing.addCar("pobi");
        racing.addCar("crong");
        racing.addCar("honux");

        assertThat(racing.getCars().size()).isEqualTo(3);
        assertThat(racing.getCars()).extracting("name").containsExactly("pobi", "crong", "honux");
    }

    @Test
    void checkNumberAndMove_4미만() {
        racing.addCar("name");
        racing.checkNumberAndMove(0, 3);

        assertThat(racing.getCar(0).getPosition()).isEqualTo(1);
    }

    @Test
    void checkNumberAndMove_4이상() {
        racing.addCar("name");
        racing.checkNumberAndMove(0, 4);

        assertThat(racing.getCar(0).getPosition()).isEqualTo(2);
    }
}
