package com.bottleparks.kata.carracing.pjh;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void canCreateCarWithName() throws Exception {
		Car car = new Car("test");
	}

	@Test
	void 차량이름의_길이가_0_이거나_5보다_크면_ERROR () throws Exception {
		assertCarName("");
		assertCarName("1256fe");
	}


	private static void assertCarName(String name) {
		Assertions.assertThatThrownBy(() -> new Car(name)).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
