package com.shxz.adapter;

public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter()
	{
		adaptee=new Adaptee();
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}
	
}
