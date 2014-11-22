package com.shxz.bridge;

public class SpeedWay extends Load{
	public SpeedWay(Car car){
		this.car=car;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("on the Street");
	}
}
