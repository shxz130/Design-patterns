package com.shxz.adapter;

public class Main {
	public static void main(String[] args) {
		Target target=new ConcreteTarget();
		target.request();
		Target target2=new  Adapter();
		target2.request();
	}
}
