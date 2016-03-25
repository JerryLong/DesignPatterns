package com.dralong.design.test;

import com.dralong.design.visitor.MySubject;
import com.dralong.design.visitor.MyVisitor;
import com.dralong.design.visitor.Subject;
import com.dralong.design.visitor.Visitor;

public class VisitorTest {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}
