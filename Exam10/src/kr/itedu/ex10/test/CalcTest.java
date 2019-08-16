package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(30, Calc.sum(10,20));
		assertEquals(30, Calc.sum(15,15));
		assertEquals(30, Calc.sum(20,10));
		assertEquals(30, Calc.sum(10,20));
	}

}
