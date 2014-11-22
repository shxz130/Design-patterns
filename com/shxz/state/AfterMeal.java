package com.shxz.state;

public class AfterMeal implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println(" after meal....");
	}

	@Override
	public State nextState() {
		// TODO Auto-generated method stub
		return null;
	}

}
