package com.shxz.Composite;

public class Text {
	public static void main(String[] args) {
		FenGongSi fenGongSi=new FenGongSi("�ܹ�˾");
		fenGongSi.add(new BuMen("�ܹ�˾�²���1"));
		fenGongSi.add(new BuMen("�ܹ�˾�²���2"));
		FenGongSi fengongsi1=new FenGongSi("�ܹ�˾�·ֹ�˾1");
		fenGongSi.add(fengongsi1);
		FenGongSi fengongsi2=new FenGongSi("�ܹ�˾�·ֹ�˾2");
		fenGongSi.add(fengongsi2);
		
		FenGongSi fengongsi11=new FenGongSi("�ܹ�˾�·ֹ�˾1�ֲ���1");
		fengongsi1.add(fengongsi11);
		FenGongSi fengongsi12=new FenGongSi("�ܹ�˾�·ֹ�˾1�ֲ���2");
		fengongsi1.add(fengongsi12);
		
		FenGongSi fengongsi21=new FenGongSi("�ܹ�˾�·ֹ�˾2�ֲ���1");
		fengongsi2.add(fengongsi21);
		FenGongSi fengongsi22=new FenGongSi("�ܹ�˾�·ֹ�˾2�ֲ���2");
		fengongsi2.add(fengongsi22);
		fenGongSi.iterate();
	}
}
