package com.bottleparks.kata.carracing.kbj;

import java.util.Scanner;

public class InputView {

    // 입력 받기
    private static Scanner sc = new Scanner(System.in);

    // 자동차 이름 입력받기
    public static String inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        return sc.nextLine();
    }

    // 횟수 입력
    public static String inputAttempt() {
        System.out.println("시도할 횟수를 입력하세요.");
        return sc.nextLine();
    }

}
