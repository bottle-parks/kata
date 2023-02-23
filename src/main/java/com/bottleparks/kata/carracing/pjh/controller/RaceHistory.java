package com.bottleparks.kata.carracing.pjh.controller;

import java.util.List;

public record RaceHistory(List<CarPosition> carPositions, int tryCount) {

}
