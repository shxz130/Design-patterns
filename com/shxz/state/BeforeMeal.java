package com.shxz.state;

public class BeforeMeal implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("before meal...");
	}

	@Override
	public State nextState() {
		// TODO Auto-generated method stub
		return new Mealing();
	}

}
