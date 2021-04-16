package jUnittest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	void test() {
		jUnittesting junit = new jUnittesting();
		int result = junit.addNumber(20, 40);
		assertEquals(60, result);
	}

}
