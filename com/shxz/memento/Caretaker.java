package com.shxz.memento;

import java.awt.Robot;

public class Caretaker {
	Memento menMemento;

	public Memento getMenMemento() {
		return menMemento;
	}

	public void setMenMemento(Memento menMemento) {
		this.menMemento = menMemento;
	}
	
	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setState("״̬һ");
		Caretaker caretaker=new Caretaker();
		caretaker.setMenMemento(originator.createMemento());
		originator.setState("״̬��");
		System.out.println(originator.getState());
		originator.restoreMemento(caretaker.getMenMemento());
		System.out.println(originator.getState());
	}
	
}
