package com.bottleparks.kata.carracing.pjh.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

	private Car sut;

	@BeforeEach
	void setUp() throws Exception {
		sut = new Car("test");
	}

	@Test
	void 차량이름의_길이가_0_이거나_5보다_크면_ERROR() throws Exception {
		assertCarNameError("");
		assertCarNameError("1256fe");
	}

	@Test
	void 차량은_4이상_일때만_전진할_수_있다() throws Exception {
		assertCarMove(3, 0);
		assertCarMove(4, 1);
	}

	private void assertCarMove(int number, int expected) {
		sut.move(number);
		Assertions.assertThat(sut.getPosition()).isEqualTo(expected);
	}

	private void assertCarNameError(String name) {
		Assertions.assertThatThrownBy(() -> new Car(name)).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
