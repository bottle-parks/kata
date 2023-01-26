package com.bottleparks.kata.carracing.pcy.utils;

import java.util.regex.Pattern;

public class InputUtil {

    public static final int NAME_MAX_LENGTH = 5;
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

    public static void validName(final String name) {
        if (name.trim().length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + NAME_MAX_LENGTH + "글자를 초과할 수 없습니다. 다시 입력해주세요.");
        }
    }
}
