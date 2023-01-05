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

	@Test
	void 차량은_4이상_일때만_전진할_수_있다 () throws Exception {
		Car car = new Car("test");
		car.move(3);
		Assertions.assertThat(car.getPosition()).isEqualTo(0);
		car.move(4);
		Assertions.assertThat(car.getPosition()).isEqualTo(1);
	}

	private static void assertCarName(String name) {
		Assertions.assertThatThrownBy(() -> new Car(name)).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
