package com.bottleparks.kata.carracing.pjh;

public class App {

	public static void main(String[] args) {
		InputView inputView = new InputView();
		ResultView resultView = new ResultView();

		UserInput userInput = inputView.getUserInput();
		CarRacing carRacing = new CarRacing(userInput.getCarsFromName(), userInput.tryCount());

		resultView.printResult(carRacing.startRace());

	}
}
