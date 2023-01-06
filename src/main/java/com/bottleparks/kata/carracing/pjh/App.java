package com.bottleparks.kata.carracing.pjh;

import com.bottleparks.kata.carracing.pjh.controller.CarRacing;
import com.bottleparks.kata.carracing.pjh.view.InputView;
import com.bottleparks.kata.carracing.pjh.view.ResultView;
import com.bottleparks.kata.carracing.pjh.view.UserInput;

public class App {

	public static void main(String[] args) {
		InputView inputView = new InputView();
		ResultView resultView = new ResultView();

		UserInput userInput = inputView.getUserInput();
		CarRacing carRacing = new CarRacing(userInput.getCarsFromName(), userInput.tryCount());

		resultView.printResult(carRacing.startRace());

	}
}
