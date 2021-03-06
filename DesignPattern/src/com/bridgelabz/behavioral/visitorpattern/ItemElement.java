package com.bridgelabz.behavioral.visitorpattern;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/09
 */
public interface ItemElement {

	int accept(IShoppingCartVisitor visitor);
}
