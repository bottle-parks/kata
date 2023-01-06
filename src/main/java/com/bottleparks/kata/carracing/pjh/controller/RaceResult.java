package com.bottleparks.kata.carracing.pjh.controller;

import java.util.List;
import java.util.stream.Collectors;

public record RaceResult(List<CarInfo> cars, int tryCount) {

	public String getWinners() {
		int maxPosition = cars.stream()
			.mapToInt(CarInfo::position)
			.max()
			.orElseThrow();

		return cars.stream()
			.filter(car -> car.position() == maxPosition)
			.map(CarInfo::name)
			.collect(Collectors.joining(","));
	}
}
