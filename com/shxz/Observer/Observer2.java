package com.shxz.Observer;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Observable2:"+arg);
	}

}
