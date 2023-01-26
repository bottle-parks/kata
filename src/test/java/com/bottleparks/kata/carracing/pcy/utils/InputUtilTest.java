package com.bottleparks.kata.carracing.pcy.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputUtilTest {

    @ParameterizedTest
    @NullAndEmptySource
    void splitComma_Null_공백(String input) {
        assertThatThrownBy(() -> InputUtil.splitComma(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 입력입니다. 다시 입력해주세요.");
    }

    @ParameterizedTest
    @ValueSource(strings = {",", "name, ,name", "name,", ",name", ",name,"})
    void splitComma_잘못된_쉼표위치(String input) {
        assertThatThrownBy(() -> InputUtil.splitComma(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 쉼표(,)를 기준으로 구분합니다. 다시 입력해주세요.");
    }

    @Test
    void splitComma() {
        String[] result = InputUtil.splitComma("pobi,crong,honux");

        assertThat(result.length).isEqualTo(3);
        assertThat(result).containsExactly("pobi", "crong", "honux");
    }
}
