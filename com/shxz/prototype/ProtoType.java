package com.shxz.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ProtoType implements Cloneable,Serializable{
	String name;
	private Wife myWife;
	
	public ProtoType(){
	}
	
	public Wife getMyWifeName() {
		return myWife;
	}

	public void setMyWifeName(Wife myWifeName) {
		this.myWife = myWifeName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object clone()
	{
		try {
			return  super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	 public  Object deepClone(){
	        //将对象写到流里
	        try {
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(this);
				//从流里读回来
				ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bis);
				return ois.readObject();
			} catch (ClassNotFoundException e) {
			
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				return null;
			}
	    }
	public static void main(String[] args) {
		ProtoType protoType1=new ProtoType();
		Wife wife=new Wife();
		wife.setName("prototype1 wife");
		protoType1.setName("prototype1");
		protoType1.setMyWifeName(wife);
		ProtoType protoType2=(ProtoType) protoType1.deepClone();
		
		protoType2.setName("prototype2");
		System.out.println(protoType1.getName());
		System.out.println(protoType2.getName());
		System.out.println(protoType1.getMyWifeName());
		System.out.println(protoType2.getMyWifeName());
		protoType2.getMyWifeName().setName("protoType2 wife");
		System.out.println(protoType1.getMyWifeName().getName());
		System.out.println(protoType2.getMyWifeName().getName());
	}
}
