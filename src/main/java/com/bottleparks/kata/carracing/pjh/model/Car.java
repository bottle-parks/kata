package com.bottleparks.kata.carracing.pjh.model;

import org.springframework.util.Assert;

public class Car {

	private final String name;
	private int position;

	public Car(String name) {
		Assert.isTrue(
			name.length() > 0 && name.length() <= 5,
			"차량 이름은 1자 이상 5자 이하만 가능합니다."
		);
		this.name = name;
	}

	public void move(int number) {
		if (number >= 4) {
			this.position++;
		}
	}

	public int getPosition() {
		return this.position;
	}

	public String getName() {
		return name;
	}
}
