package com.dralong.design.test;

import com.dralong.design.iterator.Collection;
import com.dralong.design.iterator.Iterator;
import com.dralong.design.iterator.MyCollection;

public class IteratorTest {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
