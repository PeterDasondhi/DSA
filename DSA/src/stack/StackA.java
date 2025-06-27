package stack;

import java.util.EmptyStackException;

public class StackA {
	
	private int[] stackArray;
	private int top;
	
	public StackA() {
		stackArray = new int[10];
		top = -1;
	}
	
	public StackA(int maxSize) {
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == stackArray.length - 1;
	}
	
	
	public void push(int a) {
		if(isFull()) {
			System.out.print("Stack Overflow");
			return;
		}
		
		top = top + 1;
		stackArray[top] = a;
	}
	
	public int pop() {
		int x;
		if(isEmpty()) {
			System.out.print("Stack is Empty");
			throw new EmptyStackException();
		}
		x = stackArray[top];
		top = top - 1;
		return x;
	}

	

}
