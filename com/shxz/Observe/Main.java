package com.shxz.Observe;

public class Main {
	public static void main(String[] args) {
		Observed observed=new Observed();
		observed.addObserve(new Observer1());
		observed.addObserve(new Obserever2());
		observed.change("died");
		observed.change("lived");
	}
}
