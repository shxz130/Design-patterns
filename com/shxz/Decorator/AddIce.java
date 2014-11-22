package com.shxz.Decorator;

public class AddIce extends PeiLiao{
	private Water water;
	public AddIce(Water water)
	{
		this.water=water;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return water.getDescription()+"¼Ó±ù";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return water.cost()+10;
	}
}
