package io.yadnyesh.unittesting.unittesting.business;

import org.springframework.beans.factory.annotation.Autowired;

import io.yadnyesh.unittesting.unittesting.data.SomeDataService;

public class MyBusinessImpl {
	
	SomeDataService someDataService;
	
	public int calculate(int[] data) {
		int sum = 0;
		for(int value:data) {
			sum += value;
		}
		return sum;
	}
	
	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for(int value:data) {
			sum += value;
		}
		return sum;
	}

	public SomeDataService getSomeDataService() {
		return someDataService;
	}

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}
	

}
