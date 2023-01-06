package com.bottleparks.kata.carracing.pjh.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.bottleparks.kata.carracing.pjh.controller.CarInfo;
import com.bottleparks.kata.carracing.pjh.controller.RaceResult;

class RaceResultTest {

	@Test
	void raceResultCanSelectWinners() throws Exception {
		assertWinners(
			"jay",
			new CarInfo("jay", 5),
			new CarInfo("pjh", 4),
			new CarInfo("test", 4)
		);
		assertWinners(
			"jay,pjh",
			new CarInfo("jay", 5),
			new CarInfo("pjh", 5),
			new CarInfo("test", 4)
		);
		assertWinners(
			"jay,pjh,test",
			new CarInfo("jay", 5),
			new CarInfo("pjh", 5),
			new CarInfo("test", 5)
		);
	}

	private static void assertWinners(String expectedWinners, CarInfo... carInfos) {

		RaceResult raceResult =
			new RaceResult(
				Arrays.stream(carInfos).toList(),
				4
			);

		assertEquals(expectedWinners, raceResult.getWinners());
	}

}