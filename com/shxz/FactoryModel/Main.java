package com.shxz.FactoryModel;

public class Main {
	public static void main(String[] args) {
			DaKaCheFactory daKaCheFactory=new DaKaCheFactory();
			DaKaChe daKaChe=(DaKaChe) daKaCheFactory.ceateCar();
			daKaChe.getSpleed();
			XiaoqicheFactory xiaoqicheFactory=new XiaoqicheFactory();
			XIaoqiche xIaoqiche=(XIaoqiche) xiaoqicheFactory.ceateCar();
			xIaoqiche.getSpleed();
	}
}
