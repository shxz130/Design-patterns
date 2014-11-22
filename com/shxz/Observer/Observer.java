package com.shxz.Observer;

import java.util.Observable;

public class Observer implements java.util.Observer{

	@Override
	public void update(Observable o, Object arg) {
	 
		System.out.println("observer1"+arg);
	}

}
