package com.bottleparks.kata.carracing.pcy.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("name");
    }

    @Test
    void create() {
        assertThat(car.getName()).isEqualTo("name");
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void move() {
        car.move();

        assertThat(car.getPosition()).isEqualTo(2);
    }
}
