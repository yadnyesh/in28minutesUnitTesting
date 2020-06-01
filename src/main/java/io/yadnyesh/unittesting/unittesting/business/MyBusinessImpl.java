package io.yadnyesh.unittesting.unittesting.business;

public class MyBusinessImpl {
	
	public int calculate(int[] data) {
		int sum = 0;
		for(int value:data) {
			sum += value;
		}
		return sum;
	}

}
