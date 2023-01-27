package com.bottleparks.kata.carracing.pcy.utils.constants;

import static com.bottleparks.kata.carracing.pcy.utils.InputUtil.NAME_MAX_LENGTH;

public class ErrorConstant {

    private ErrorConstant() {
    }

    public static final String INVALID_INPUT = "잘못된 입력입니다. 다시 입력해주세요.";
    public static final String INVALID_COMMA_LOCATION = "자동차 이름은 쉼표(,)를 기준으로 구분합니다. 다시 입력해주세요.";
    public static final String NAME_MORE_THEN_MAX_LENGTH = "자동차 이름은 " + NAME_MAX_LENGTH + "글자를 초과할 수 없습니다. 다시 입력해주세요.";
    public static final String NO_REGISTER_CAR = "경주할 자동차가 없습니다. 자동차를 등록해 주세요.";
    public static final String NOT_NUMBER = "숫자만 입력할 수 있습니다. 다시 입력해주세요.";
}
