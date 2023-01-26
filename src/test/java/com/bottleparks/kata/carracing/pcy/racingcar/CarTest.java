package com.bottleparks.kata.carracing.pcy.racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void createCar() {
        Car car = new Car("name");

        assertThat(car.getName()).isEqualTo("name");
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
