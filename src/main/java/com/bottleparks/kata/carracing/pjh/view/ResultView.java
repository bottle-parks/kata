package com.bottleparks.kata.carracing.pjh.view;

import java.util.List;

import com.bottleparks.kata.carracing.pjh.controller.CarInfo;
import com.bottleparks.kata.carracing.pjh.controller.RaceResult;

public class ResultView {

   public void printResult(List<RaceResult> raceResult) {
      raceResult.forEach(this::printResultEachRounds);

      System.out.println(
         raceResult.get(raceResult.size() - 1).getWinners()
         + "가 최종 우승했습니다."
      );

   }

   private void printResultEachRounds(RaceResult raceResult) {
      for(CarInfo carInfo : raceResult.cars()) {
         System.out.println(carInfo.name() + " : " + "-".repeat(carInfo.position()));
      }
      System.out.println();
   }
}