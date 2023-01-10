package com.bottleparks.kata.carracing.pjh.controller;

import org.junit.jupiter.api.Test;

class RaceHistoryTest {

	@Test
	void raceResultCanSelectWinners() throws Exception {
		assertWinners(
			"jay",
			new CarPosition("jay", 5),
			new CarPosition("pjh", 4),
			new CarPosition("test", 4)
		);
		assertWinners(
			"jay,pjh",
			new CarPosition("jay", 5),
			new CarPosition("pjh", 5),
			new CarPosition("test", 4)
		);
		assertWinners(
			"jay,pjh,test",
			new CarPosition("jay", 5),
			new CarPosition("pjh", 5),
			new CarPosition("test", 5)
		);
	}

	private static void assertWinners(String expectedWinners, CarPosition... carPositions) {

		// RaceResult raceResult =
		// 	new RaceResult(
		// 		Arrays.stream(carPositions).toList(),
		// 		4
		// 	);
		//
		// assertEquals(expectedWinners, raceResult.getWinners());
	}

}