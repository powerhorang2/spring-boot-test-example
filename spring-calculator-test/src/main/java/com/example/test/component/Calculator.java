package com.example.test.component;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Calculator {
	
	private final ICalculator iCalculator;
	
	public int sum(int x, int y) {
		this.iCalculator.init();
		return this.iCalculator.sum(x, y);
	}
	
	public int minus(int x, int y) {
		this.iCalculator.init();
		return this.iCalculator.minus(x, y);
	}
	

}
