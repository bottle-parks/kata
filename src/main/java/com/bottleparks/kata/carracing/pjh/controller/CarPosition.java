package com.bottleparks.kata.carracing.pjh.controller;

import com.bottleparks.kata.carracing.pjh.model.Car;

public record CarPosition(String name, int position) {
	public CarPosition(Car car) {
		this(car.getName(), car.getPosition());
	}
}
