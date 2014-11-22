package com.shxz.state;

public class Mealing implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("mealing");
	}

	@Override
	public State nextState() {
		// TODO Auto-generated method stub
		return new AfterMeal();
	}
	

}
