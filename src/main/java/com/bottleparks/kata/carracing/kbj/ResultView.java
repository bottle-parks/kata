package com.bottleparks.kata.carracing.kbj;

import java.util.List;

public class ResultView {
    public static void printError(String error) {
        System.out.println(error);
    }

    public static void printCar(String carName) {
        System.out.println(carName + ": ");
    }

    public static void printPos(int pos) {
        for (int i = 0; i < pos; i++) {
            System.out.print("ㅡ");
        }
        System.out.println();
    }

    public static void printResult() {
        System.out.println("실행결과: ");
    }

    public static void printCarNPos(Car car) {
        printCar(car.getName());
        printPos(car.getPos());
    }

    public static void printWinner(List<String> winnerList) {
        System.out.println("승자는 : " + String.join(",", winnerList));
    }
}
