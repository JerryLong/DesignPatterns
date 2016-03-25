package com.dralong.design.test;

import com.dralong.design.observer.MySubject;
import com.dralong.design.observer.Observer1;
import com.dralong.design.observer.Observer2;
import com.dralong.design.observer.Subject;

public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();
	}
}
