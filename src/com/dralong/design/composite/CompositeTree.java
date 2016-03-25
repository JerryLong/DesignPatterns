package com.dralong.design.composite;

/**
 * 
 * Title:CompositeTree
 * 
 * Description: 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * 
 * @author Jerry
 * @date 2016年3月25日下午2:42:08
 */
public class CompositeTree {
	public TreeNode root = null;

	public CompositeTree(String name) {
		root = new TreeNode(name);
	}

}
