package com.bottleparks.kata.carracing.kbj;

import java.util.Arrays;

public class ValidationCheck {

    // 자동차 유효성 검사
    public boolean isValidCarName(String carName) {
        String[] carNames = carName.split(",");
        return chkCarLength(carNames) && chkCarNameLength(carNames)
                && chkCarNameDup(carNames) && chkContainSpace(carNames);
    }

    // 횟수에 대한 유효성 검사
    public boolean isValidAttempt(String tryCnt) {
        try {
            int num = Integer.parseInt(tryCnt);
            if (num <= 0) {
                ResultView.printError("시도 횟수는 0 이상이어야 합니다.");
                return false;
            }
        }catch (NumberFormatException e){
            ResultView.printError("숫자를 입력해 주세요.");
            return false;
        }
        return true;
    }

    private boolean chkContainSpace(String[] carNames) {
        for (String carName : carNames) {
            if (carName.equals(" ") || carName.equals("")) {
                ResultView.printError("자동차 이름을 적어주세요");
                return false;
            }
        }
            return true;
    }

    private boolean chkCarNameDup(String[] carNames) {
        if (Arrays.stream(carNames).allMatch(carName-> carName.equals(carName))) {
            ResultView.printError("중복된 이름이 있습니다.");
            return false;
        }
        return true;
    }

    private boolean chkCarNameLength(String[] carNames) {
        for (String carName : carNames) {
            if(carName.length() > 5){
                System.out.println("자동차 이름은 5글자 이하로 적어주세요");
                return false;
            }
        }
        return true;
    }

    private boolean chkCarLength(String[] carNames) {
        if (carNames.length <= 1) {
            ResultView.printError("두 대 이상의 자동차 이름을 적어주세요.");
            return false;
        }
        return true;
    }
}
