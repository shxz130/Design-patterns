package com.shxz.builder;

public class Product {
	
	int water;
	int rice;
	boolean boided;
	public Product(){
		
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getRice() {
		return rice;
	}
	public void setRice(int rice) {
		this.rice = rice;
	}
	public boolean isBoided() {
		return boided;
	}
	public void setBoided(boolean boided) {
		this.boided = boided;
	}
	@Override
	public String toString()
	{
		return "water:"+water+"         "+"rice:"+rice+"         "+"boided:"+boided;
	}
}
