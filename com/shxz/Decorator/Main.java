package com.shxz.Decorator;

public class Main {
	public static void main(String[] args) {
		Water water=new Tea();
		System.out.println(water.getDescription());
		System.out.println(water.cost());
		water=new AddIce(water);
		System.out.println(water.getDescription());
		System.out.println(water.cost());
		water=new Addsugar(water);
		System.out.println(water.getDescription());
		System.out.println(water.cost());
	}
}
