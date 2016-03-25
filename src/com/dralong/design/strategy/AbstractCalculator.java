package com.dralong.design.strategy;

/**
 * 
 * Title:AbstractCalculator
 *
 * Description:
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，
 * 多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
 * 
 * @author Jerry
 * @date 2016年3月25日下午3:46:10
 */
public abstract class AbstractCalculator {

	// 主方法，实现对本类其它方法的调用
	public final int calculate(String exp, String opt) {
		int array[] = split(exp, opt);
		return calculate(array[0], array[1]);
	}

	// 被子类重写的方法
	abstract public int calculate(int num1, int num2);

	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
