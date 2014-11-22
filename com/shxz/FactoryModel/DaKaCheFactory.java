package com.shxz.FactoryModel;

public class DaKaCheFactory extends VehicleFactory{
	@Override
	public Movable ceateCar() {
		// TODO Auto-generated method stub
		return new DaKaChe();
	}
}
