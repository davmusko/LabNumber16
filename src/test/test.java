package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {

assertTrue(PrimeNumGen.PrimeNumber.isPrime(2));
	}
	@Test
	void test2() {

assertTrue(PrimeNumGen.PrimeNumber.isPrime(3));
	}
	@Test
	void test3() {

assertTrue(PrimeNumGen.PrimeNumber.isPrime(7));
	}
	@Test
	void test4() {

assertFalse(PrimeNumGen.PrimeNumber.isPrime(8));
	}
	@Test
	void test5() {
int expected = 13;
int actual = PrimeNumGen.PrimeNumber.counter(6);
assertEquals(expected, actual);
	}
	void test6() {
		int expected = 2;
		int actual = PrimeNumGen.PrimeNumber.counter(1);
		assertEquals(expected, actual);
			}
	void test7() {
		int expected = 2;
		int actual = PrimeNumGen.PrimeNumber.counter(3);
		assertEquals(expected, actual);
			}
}
