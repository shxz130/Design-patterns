package com.shxz.FactoryModel;

public class XiaoqicheFactory extends VehicleFactory{
	@Override
	public Movable ceateCar() {
		// TODO Auto-generated method stub
		return new XIaoqiche();
	}
}
