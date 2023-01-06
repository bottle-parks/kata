package com.bottleparks.kata.carracing.pjh;

import java.util.List;
import java.util.stream.IntStream;

public class CarRacing {

	private final List<Car> cars;
	private final int tryCount;

	public CarRacing(List<Car> cars, int tryCount) {
		this.cars = cars;
		this.tryCount = tryCount;
	}

	int generateRandomNumber() {
		return (int) (Math.random() * 10);
	}

	public void moveCars() {
		cars.forEach(car -> car.move(generateRandomNumber()));
	}

	public void startRace() {
		IntStream.range(0, tryCount)
			.forEach(i -> moveCars());
	}
}
