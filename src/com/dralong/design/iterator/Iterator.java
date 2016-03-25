package com.dralong.design.iterator;

/**
 * 
 * Title:Iterator
 *
 * Description:
 * 顾名思义，迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。这句话包含两层意思：
 * 一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 * 
 * @author Jerry
 * @date 2016年3月25日下午4:20:12
 */
public interface Iterator {
	// 前移
	public Object previous();

	// 后移
	public Object next();

	public boolean hasNext();

	// 取得第一个元素
	public Object first();
}
