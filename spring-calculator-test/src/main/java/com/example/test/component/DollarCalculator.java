package com.example.test.component;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DollarCalculator implements ICalculator {

	private int price = 1;
	private final MarketApi marketApi;
	
	@Override
	public void init() {
		this.price = marketApi.connect();
	}
	
	@Override
	public int sum(int x, int y) {
		x *= price;
		y *= price;
		return x + y;
	}

	@Override
	public int minus(int x, int y) {
		// TODO Auto-generated method stub
		x *= price;
		y *= price;
		return x - y;
	}

}
