package com.bottleparks.kata.carracing.pjh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.util.Assert;

import com.bottleparks.kata.carracing.pjh.model.Car;

public class CarRacing {

	private final List<Car> cars;
	private final int tryCount;
	private final List<RaceHistory> raceHistory;

	public CarRacing(List<String> cars, int tryCount) {
		this.cars = cars.stream().map(Car::new).toList();
		this.tryCount = tryCount;
		this.raceHistory = new ArrayList<>();
	}

	int generateRandomNumber() {
		return (int)(Math.random() * 10);
	}

	public void startRace() {
		IntStream.range(0, tryCount)
			.forEach(i -> {
				moveCars();
				recordHistory(i);
			});
	}

	public List<CarPosition> getWinners() {
		Assert.isTrue(raceHistory.size() == tryCount, "종료된 Race 아님");
		List<CarPosition> lastLapCarPositions = raceHistory.get(tryCount - 1).carPositions();
		int maxPosition = getLeadLapCounts(lastLapCarPositions);
		return getWinnersList(lastLapCarPositions, maxPosition);
	}

	public List<RaceHistory> getRaceHistory() {
		return this.raceHistory;
	}

	private List<CarPosition> getWinnersList(List<CarPosition> lastLapCarPositions, int maxPosition) {
		return lastLapCarPositions.stream()
			.filter(car -> car.position() == maxPosition)
			.toList();
	}

	private int getLeadLapCounts(List<CarPosition> lastLapCarPositions) {
		return lastLapCarPositions.stream()
			.mapToInt(CarPosition::position)
			.max()
			.orElseThrow();
	}

	void moveCars() {
		cars.forEach(car -> car.move(generateRandomNumber()));
	}

	List<Car> getCars() {
		return this.cars;
	}

	private void recordHistory(int tryCount) {
		List<CarPosition> currentCarPositions = cars.stream().map(CarPosition::new).toList();
		raceHistory.add(new RaceHistory(currentCarPositions, tryCount));
	}

}
