package com.shxz.Observe;

public class Observer1 implements Observe{
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		System.out.println("我是1号，被监视的状态改为"+state);
	}
}
