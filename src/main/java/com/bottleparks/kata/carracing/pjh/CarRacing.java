package com.bottleparks.kata.carracing.pjh;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

	public List<RaceResult> startRace() {
		return IntStream.range(0, tryCount)
			.mapToObj(i -> {
				moveCars();
				return new RaceResult(makeCarDto(), i);
			}).toList();
	}

	private List<CarDto> makeCarDto() {
		return cars.stream()
			.map(car -> new CarDto(car.getName(), car.getPosition()))
			.toList();
	}
}
