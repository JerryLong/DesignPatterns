package com.dralong.design.test;

import com.dralong.design.interpreter.Context;
import com.dralong.design.interpreter.Minus;
import com.dralong.design.interpreter.Plus;

public class InterpreterTest {

	public static void main(String[] args) {
		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}

}
