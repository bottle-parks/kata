package com.bottleparks.kata.carracing.kbj;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final String name;
    private int pos = 0 ;
    public static int maxPos = 0;

    public static List<Car> carList = new ArrayList<>();

    public Car(String name, int pos) {
        this.name = name;
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    public int getPos() {
        return pos;
    }

    public void move() {
        pos++;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public static void moveable(Car car) {
        if(RandomGenerator.overFour())
            car.move();
    }

    public static void winner() {
        posIsMaxPos();
        winnerList();
    }

    private static List<String> winnerList() {
        List<String> winnerList = new ArrayList<>();
        for (Car car : carList) {
            if (car.pos == maxPos) {
                winnerList.add(car.getName());
            }
        }
        return winnerList;
    }

    private static int posIsMaxPos() {
        for (Car car : carList) {
            if (car.pos > maxPos) {
                maxPos = car.pos;
            }
        }
        return maxPos;
    }
}
