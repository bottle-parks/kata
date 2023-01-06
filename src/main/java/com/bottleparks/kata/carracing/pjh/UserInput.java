package com.bottleparks.kata.carracing.pjh;

import java.util.List;
import java.util.stream.Stream;

public record UserInput(String carNames, int tryCount) {
	public List<Car> getCarsFromName() {
		return Stream.of(carNames.split(",")).map(Car::new).toList();
	}
}
