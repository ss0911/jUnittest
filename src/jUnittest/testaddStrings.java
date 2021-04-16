package jUnittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddStrings {

	@Test
	void test() {
		
		jUnittesting junitStrings = new jUnittesting();
		String result = junitStrings.addStrings("Always Be Happy"," Live your Life");
		assertEquals("Always Be Happy Live your Life", result);
	}

}
