package com.bottleparks.kata.carracing.pjh;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class RaceResultTest {

	@Test
	void raceResultCanSelectWinners() throws Exception {
		List<CarDto> carDtos =
			List.of(
				new CarDto("pjh", 1),
				new CarDto("jay", 2),
				new CarDto("test", 2)
			);
		RaceResult raceResult = new RaceResult(carDtos , 4);

		assertEquals("jay,test", raceResult.getWinners());
	}

}