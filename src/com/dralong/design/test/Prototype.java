package com.dralong.design.test;

public class Prototype {
	public static void main(String[] args) {
		Prototype obj = new Prototype();
		
		try {
		Prototype obj2 = (Prototype) obj.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
