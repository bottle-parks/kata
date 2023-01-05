package com.bottleparks.kata.carracing.pjh;

import java.util.List;

public class CarRacing {

	private final List<Car> cars;

	public CarRacing(List<Car> cars) {
		this.cars = cars;
	}

	public int generateRandomNumber() {
		return (int) (Math.random() * 10);
	}
}
