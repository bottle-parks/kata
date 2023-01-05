package com.bottleparks.kata.carracing.pjh;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarFixture {

	public static List<Car> createCars(int numberOfCars) {
		assert numberOfCars < 100 : "차는 99대 까지만 생성 가능 합니다.";
		return IntStream.range(0, numberOfCars)
			.mapToObj(i -> new Car("car" + i))
			.collect(Collectors.toList());
	}
}
