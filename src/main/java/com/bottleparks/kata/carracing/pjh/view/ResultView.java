package com.bottleparks.kata.carracing.pjh.view;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.bottleparks.kata.carracing.pjh.controller.CarPosition;
import com.bottleparks.kata.carracing.pjh.controller.RaceHistory;

public class ResultView {

	public void printWinner(List<CarPosition> winners) {
		String WinnersInString = winners.stream().map(CarPosition::name).collect(Collectors.joining(","));
		System.out.println(WinnersInString + "가 최종 우승했습니다.");
	}

	public void printRaceHistory(List<RaceHistory> raceHistory) {
		IntStream.range(0, raceHistory.size())
			.forEach(laps -> {
				printLabHistory(raceHistory, laps);
				System.out.println();
			});
	}

	private void printResultEachRounds(CarPosition carPosition) {
		System.out.println(carPosition.name() + " : " + "-".repeat(carPosition.position()) + "\n");
	}

	private void printLabHistory(List<RaceHistory> raceHistory, int laps) {
		raceHistory.get(laps).carPositions().forEach(car -> {
				System.out.println(car.name() + " : " + "-".repeat(car.position()));
			}
		);

	}
}