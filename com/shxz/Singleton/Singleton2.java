package com.shxz.Singleton;

public class Singleton2 {
	private static Singleton2 singleton=new Singleton2();
	private Singleton2(){
	}
	public static Singleton2 getInstance()
	{
		return singleton;
	}

}
