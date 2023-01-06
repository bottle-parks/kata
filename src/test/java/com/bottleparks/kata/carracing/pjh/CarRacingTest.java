package com.bottleparks.kata.carracing.pjh;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 2️⃣ 자동차 경주 게임 구현
 * 기능 요구사항
 * 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
 * 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
 * 자동차 이름은 쉼표(,)를 기준으로 구분한다.
 * 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
 * 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
 */
public class CarRacingTest {

	private CarRacing sut;
	private final List<Car> cars = CarFixture.createCars(5);
	private final int tryCount = 5;

	@BeforeEach
	void setUp() {
		sut = new CarRacing(cars, tryCount);
	}

	@Test
	void CarRacingCanGenerateRandomNumbers() throws Exception {
		assertDoesNotThrow(()->sut.generateRandomNumber());
	}

	@Test
	void GeneratedRandomNumberShouldBetween0And9() throws Exception {
		IntStream.range(0,100).forEach(i->{
			int randomNumber = sut.generateRandomNumber();
			assertTrue(randomNumber >= 0 && randomNumber <= 9);
		});
	}

	@Test
	void CarRacingCanMoveCars() throws Exception {
		assertDoesNotThrow(()->sut.moveCars());
	}

	@Test
	void carRacingCanStartRace () throws Exception {
		assertDoesNotThrow(()->sut.startRace());
	}

	@Test
	void startRacingReturnRacingResult () throws Exception {
		assertEquals(tryCount, sut.startRace().size());
	}

}
