package com.bottleparks.kata.carracing.pjh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserInputTest {

	@Test
	void UserInputCanMakeCarsFromInput() throws Exception {
		UserInput userInput = new UserInput("pjh,jay",5);
		assertEquals(2, userInput.getCarsFromName().size());
	}

}