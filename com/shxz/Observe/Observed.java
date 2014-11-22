package com.shxz.Observe;

public class Observed extends Subject{
	private String state; 
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void change(String newstate)
	{
		this.setState(newstate);
		this.notifyAllObservers(newstate);
	}
}
