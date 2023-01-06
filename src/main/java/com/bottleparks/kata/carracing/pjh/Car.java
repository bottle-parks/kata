package com.bottleparks.kata.carracing.pjh;

public class Car {

	private final String name;
	private int position;

	public Car(String name) {
		if(name.length() == 0 || name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 0~5자만 허용 합니다.");
		}

		this.name = name;
	}

	public void move(int number) {
		if(number >= 4) {
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
