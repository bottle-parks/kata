package com.bottleparks.kata.carracing.pcy.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.bottleparks.kata.carracing.pcy.utils.constants.ErrorConstant.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputUtilTest {

    @ParameterizedTest
    @NullAndEmptySource
    void splitComma_Null_공백(String input) {
        assertThatThrownBy(() -> InputUtil.splitComma(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INVALID_INPUT);
    }

    @ParameterizedTest
    @ValueSource(strings = {",", "name, ,name", "name,", ",name", ",name,"})
    void splitComma_잘못된_쉼표위치(String input) {
        assertThatThrownBy(() -> InputUtil.splitComma(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INVALID_COMMA_LOCATION);
    }

    @Test
    void splitComma() {
        String[] result = InputUtil.splitComma("pobi,crong,honux");

        assertThat(result.length).isEqualTo(3);
        assertThat(result).containsExactly("pobi", "crong", "honux");
    }

    @Test
    void validName_5글자초과() {
        assertThatThrownBy(() -> InputUtil.validName("racing"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(NAME_MORE_THEN_MAX_LENGTH);
    }
}
