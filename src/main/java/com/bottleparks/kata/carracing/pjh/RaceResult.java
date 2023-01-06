package com.bottleparks.kata.carracing.pjh;

import java.util.List;
import java.util.stream.Collectors;

public record RaceResult(List<CarDto> cars, int tryCount) {

	public String getWinners() {
		int maxPosition = cars.stream()
			.mapToInt(CarDto::position)
			.max()
			.orElseThrow();

		return cars.stream()
			.filter(car -> car.position() == maxPosition)
			.map(CarDto::name)
			.collect(Collectors.joining(","));
	}
}
