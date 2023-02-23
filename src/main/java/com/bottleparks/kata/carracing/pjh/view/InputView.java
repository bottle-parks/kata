package com.bottleparks.kata.carracing.pjh.view;

import java.util.List;
import java.util.Scanner;

import org.springframework.util.Assert;

public class InputView {

	public UserInput getUserInput() {
		Scanner sc = new Scanner(System.in);
		return new UserInput(getCarNames(sc), getTryCount(sc));
	}

	private int getTryCount(Scanner sc) {
		System.out.println("시도할 회수는 몇회인가요?");
		int tryCount = sc.nextInt();
		Assert.isTrue(0 < tryCount, "0보다 커야함");

		return tryCount;
	}

	private List<String> getCarNames(Scanner sc) {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		List<String> carNames = List.of(sc.nextLine().split(","));

		carNames.forEach(car -> {
			Assert.isTrue(car.length() > 0, "자동차 이름은 0자 이상만 허용합니다.");
			Assert.isTrue(car.length() < 5, "자동차 이름은 5자 이하만 허용합니다.");
		});

		return carNames;
	}
}
