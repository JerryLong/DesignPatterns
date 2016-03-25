package com.dralong.design.test;

import com.dralong.design.templatemethod.AbstractCalculator;
import com.dralong.design.templatemethod.Plus;

public class TemplateMethodTest {
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}
