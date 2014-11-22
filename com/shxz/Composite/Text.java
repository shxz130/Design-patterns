package com.shxz.Composite;

public class Text {
	public static void main(String[] args) {
		FenGongSi fenGongSi=new FenGongSi("总公司");
		fenGongSi.add(new BuMen("总公司下部门1"));
		fenGongSi.add(new BuMen("总公司下部门2"));
		FenGongSi fengongsi1=new FenGongSi("总公司下分公司1");
		fenGongSi.add(fengongsi1);
		FenGongSi fengongsi2=new FenGongSi("总公司下分公司2");
		fenGongSi.add(fengongsi2);
		
		FenGongSi fengongsi11=new FenGongSi("总公司下分公司1分部门1");
		fengongsi1.add(fengongsi11);
		FenGongSi fengongsi12=new FenGongSi("总公司下分公司1分部门2");
		fengongsi1.add(fengongsi12);
		
		FenGongSi fengongsi21=new FenGongSi("总公司下分公司2分部门1");
		fengongsi2.add(fengongsi21);
		FenGongSi fengongsi22=new FenGongSi("总公司下分公司2分部门2");
		fengongsi2.add(fengongsi22);
		fenGongSi.iterate();
	}
}
