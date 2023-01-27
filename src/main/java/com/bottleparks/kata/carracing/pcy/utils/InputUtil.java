package com.bottleparks.kata.carracing.pcy.utils;

import java.util.Arrays;
import java.util.regex.Pattern;

import static com.bottleparks.kata.carracing.pcy.utils.constants.ErrorConstant.*;

public class InputUtil {

    public static final int NAME_MAX_LENGTH = 5;
    private static final Pattern SPLIT_COMMA_INVALID_PATTERN = Pattern.compile("^,.*|.*\\s+.*|.*,$");

    public static String[] splitComma(final String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(INVALID_INPUT);
        }

        if (SPLIT_COMMA_INVALID_PATTERN.matcher(input.trim()).matches()) {
            throw new IllegalArgumentException(INVALID_COMMA_LOCATION);
        }

        return input.split(",");
    }

    public static void validName(final String name) {
        if (name.trim().length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(NAME_MORE_THEN_MAX_LENGTH);
        }
    }

    public static void duplicationName(final String[] names) {
        if (names.length != Arrays.stream(names).distinct().count()) {
            throw new IllegalArgumentException(DUPLICATE_CAR_NAME);
        }
    }
}
