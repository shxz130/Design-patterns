package com.shxz.Strategy;

public class Main {
	public static void main(String[] args) {
		Environment environment=new Environment();
		Strategy Strategy=new AddStategy();
		environment.setStrategy(Strategy);
		environment.getResult();
	
		Strategy diviStrategy=new DivisionStategy();
		environment.setStrategy(diviStrategy);
		environment.getResult();
		
		Strategy subStrategy=new SubtractionStategy();
		environment.setStrategy(subStrategy);
		environment.getResult();
	}
}
