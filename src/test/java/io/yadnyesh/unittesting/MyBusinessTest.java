package io.yadnyesh.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.yadnyesh.unittesting.unittesting.business.MyBusinessImpl;

public class MyBusinessTest {
	
	@Test
	public void calculateSum_basic() {
		MyBusinessImpl business = new MyBusinessImpl();
		int actualResult = business.calculate(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSum_empty() {
		MyBusinessImpl business = new MyBusinessImpl();
		int actualResult = business.calculate(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSum_oneValue() {
		MyBusinessImpl business = new MyBusinessImpl();
		int actualResult = business.calculate(new int[] {10});
		int expectedResult = 10;
		assertEquals(expectedResult, actualResult);
	}

}
