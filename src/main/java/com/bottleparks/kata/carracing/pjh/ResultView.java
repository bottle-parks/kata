package com.bottleparks.kata.carracing.pjh;

import java.util.List;

public class ResultView {

   public void printResult(List<RaceResult> raceResult) {
      raceResult.forEach(this::printResultEachRounds);

      System.out.println(
         raceResult.get(raceResult.size() - 1).getWinners()
         + "가 최종 우승했습니다."
      );

   }

   private void printResultEachRounds(RaceResult raceResult) {
      for(CarDto carDto : raceResult.cars()) {
         System.out.println(carDto.name() + " : " + "-".repeat(carDto.position()));
      }
      System.out.println();
   }
}