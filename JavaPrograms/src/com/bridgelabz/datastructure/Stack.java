package com.bridgelabz.datastructure;

import java.util.NoSuchElementException;

//Stack using Array
public class Stack {
	int top;
	char[] stackArray;
	int size;

	/**
	 * define parameterised constructor
	 * 
	 * @param s ==> int
	 */
	public Stack(int s) {
		size = s;
		stackArray = new char[size];
		top = 0;
	}

	// adding the elements in a stack
	public void push(char data) {
		if (top == size) {
			System.out.println("Overflow");
		} else {
			stackArray[top++] = data;
		}
	}

	/**
	 * removing the elements from the stack
	 * 
	 * @return char
	 */
	public char pop() {
		char data = 0;
		if (isEmpty()) {
			throw new NoSuchElementException("UnderFlow");
		} else {
			data = stackArray[--top];
			stackArray[top] = 0;
		}
		return data;
	}

	/**
	 * define function peek() to get the last elements from the stack
	 * 
	 * @return int
	 */
	public int peek() {
		int data = stackArray[top - 1];
		return data;
	}

	/**
	 * to check the stack is empty or not
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		return (top <= 0);
	}

	/**
	 * to check the size of the stack
	 * 
	 * @return int
	 */
	public int size() {
		return top;
	}

	// to print the elements of the stack
	public void show() {
		for (int i : stackArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
