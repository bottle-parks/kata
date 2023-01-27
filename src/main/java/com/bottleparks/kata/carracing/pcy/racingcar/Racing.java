package com.bottleparks.kata.carracing.pcy.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static com.bottleparks.kata.carracing.pcy.utils.constants.ErrorConstant.NO_REGISTER_CAR;

public class Racing {

    private final List<Car> cars;

    public Racing() {
        this.cars = new ArrayList<>();
    }

    public void addCar(final String name) {
        cars.add(new Car(name));
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(final int idx) {
        return cars.get(idx);
    }

    public void checkNumberAndMove(final int idx, final int random) {
        if (random >= 4) {
            cars.get(idx).move();
        }
    }

    public List<Car> getWinningCars() {
        final int max = maxPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == max)
                .collect(Collectors.toList());
    }

    private int maxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElseThrow(() -> {
                    throw new NoSuchElementException(NO_REGISTER_CAR);
                });
    }
}
