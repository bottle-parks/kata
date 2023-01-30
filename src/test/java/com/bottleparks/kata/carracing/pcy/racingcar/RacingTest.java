package com.bottleparks.kata.carracing.pcy.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static com.bottleparks.kata.carracing.pcy.utils.constants.ErrorConstant.NO_REGISTER_CAR;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    void getWinningCar_자동차없음() {
        assertThatThrownBy(() -> racing.getWinningCars())
                .isInstanceOf(NoSuchElementException.class)
                .hasMessage(NO_REGISTER_CAR);
    }

    @Test
    void getWinningCar() {
        racing.addCar("pobi");
        racing.addCar("crong");
        racing.addCar("honux");

        racing.getCar(0).move();
        racing.getCar(2).move();

        assertThat(racing.getWinningCars()).extracting("name").containsExactly("pobi", "honux");
    }
}
