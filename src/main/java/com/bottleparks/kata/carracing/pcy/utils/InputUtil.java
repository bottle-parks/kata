package com.bottleparks.kata.carracing.pcy.utils;

import java.util.regex.Pattern;

public class InputUtil {

    private static final Pattern SPLIT_COMMA_INVALID_PATTERN = Pattern.compile("^,.*|.*,\\s*,.*|.*,$");

    public static String[] splitComma(final String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("잘못된 입력입니다. 다시 입력해주세요.");
        }

        if (SPLIT_COMMA_INVALID_PATTERN.matcher(input.trim()).matches()) {
            throw new IllegalArgumentException("자동차 이름은 쉼표(,)를 기준으로 구분합니다. 다시 입력해주세요.");
        }

        return input.split(",");
    }
}
