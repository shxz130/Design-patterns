package com.shxz.Strategy;

public class Environment {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void getResult()
	{
		strategy.getResult();
	}
}
