package com.bottleparks.kata.carracing.kbj;

import java.util.List;

public class Racing {

    private static List<Car> carList = Car.carList;

    private ValidationCheck check = new ValidationCheck();

    public void start() {
        String[] carName = inputCar();
        int tryCnt = inputTry();
        addCar(carName);
        displayRace(carList, tryCnt);
        Car.winner();
    }

    private void displayRace(List<Car> carList, int tryCnt) {
        ResultView.printResult();
        for (int i = 0; i < tryCnt; i++) {
            for (Car car : carList) {
                Car.moveable(car);
                ResultView.printCarNPos(car);
            }
            System.out.println();
        }
    }

    private void addCar(String[] cars) {
        for (String carName : cars) {
            Car car = new Car(carName, 0);
            car.addCar(car);
        }
    }

    private int inputTry() {
        String tryCnt = InputView.inputAttempt();
        boolean validAttempt = check.isValidAttempt(tryCnt);
        if (!validAttempt) {
            throw new IllegalArgumentException("숫자를 입력해 주세요.");
        }
        return Integer.parseInt(tryCnt);
    }

    private String[] inputCar() {
        String carName = InputView.inputCarName();
        boolean validCarName = check.isValidCarName(carName);
        if (!validCarName) {
            throw new IllegalArgumentException("맞지 않은 형식의 이름입니다.");
        }
        return carName.split(",");
    }
}
