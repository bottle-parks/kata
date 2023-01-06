package com.bottleparks.kata.carracing.pjh;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class RaceResultTest {

	@Test
	void raceResultCanSelectWinners() throws Exception {
		assertWinners(
			"jay",
			new CarDto("jay", 5),
			new CarDto("pjh", 4),
			new CarDto("test", 4)
		);
		assertWinners(
			"jay,pjh",
			new CarDto("jay", 5),
			new CarDto("pjh", 5),
			new CarDto("test", 4)
		);
		assertWinners(
			"jay,pjh,test",
			new CarDto("jay", 5),
			new CarDto("pjh", 5),
			new CarDto("test", 5)
		);
	}

	private static void assertWinners(String expectedWinners, CarDto... carDtos) {

		RaceResult raceResult =
			new RaceResult(
				Arrays.stream(carDtos).toList(),
				4
			);

		assertEquals(expectedWinners, raceResult.getWinners());
	}

}