package com.shxz.Observer;

public class Client {
	public static void main(String[] args)
	{
		Subject subject=new Subject();
		subject.addObserver(new Observer());
		subject.addObserver(new Observer2());
		subject.setName("myname");
		subject.setName("haha");
	}
}
