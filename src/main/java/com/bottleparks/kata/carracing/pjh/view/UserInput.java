package com.bottleparks.kata.carracing.pjh.view;

import java.util.List;
import java.util.stream.Stream;

import com.bottleparks.kata.carracing.pjh.model.Car;

public record UserInput(String carNames, int tryCount) {
	public List<Car> getCarsFromName() {
		return Stream.of(carNames.split(",")).map(Car::new).toList();
	}
}
