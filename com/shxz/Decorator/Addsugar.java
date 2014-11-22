package com.shxz.Decorator;

public class Addsugar extends PeiLiao{
	private Water water;
	public Addsugar(Water water)
	{
		this.water=water;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return water.getDescription()+ "╪слг";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return water.cost()+30;
	}
}
