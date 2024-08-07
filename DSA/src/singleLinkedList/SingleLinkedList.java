package singleLinkedList;

import java.util.Scanner;

public class SingleLinkedList {
	
	private Node start;
	
	public SingleLinkedList() {
		
		start  = null;
		
	}
	
	public void displayList() {
		
		Node p;
		
		if(start == null) {
			System.out.println("List is empty");
			return;
		}
		
		System.out.print("List is :     ");
		p = start;
		
		while(p!=null) {
			System.out.print(p.info + "  ");
			p = p.link;
		}
		System.out.println();
	}
	
	public void countNodes() {
		int n = 0;
		Node p = start;
		while(p!=null) {
			n++;
			p = p.link;
		}
		System.err.println("Number of nodes in the list  = " + n);
	}
	
	public boolean search(int x) {
		Node p;
		
		int position = 1;
		p = start;
		while(p!=null) {
			if(p.info == x)
				break;
			position++;
			p= p.link;
		}
		if(p==null) {
			System.out.println(x + " not found in the list");
			return false;
		}
		else {
			System.out.println(x + " is at position " + position);
			return true;
		}
	}
	
	
	public void createList() {
		
		int i, n, data;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of nodes : ");
		
		n = scan.nextInt();
		
		
		if(n == 0)
			return;
		
		for(i=1; i<=n; i++) {
			System.out.println(" Enter the element to be inserted : ");
			data = scan.nextInt();
			insertAtEnd(data);
		}
	}
		
	
	
	
	public void insertInBeginning(int data) {
		Node temp = new Node(data);
		temp.link = start;
		start = temp;
	}
	
	public void insertAtEnd(int data) {
		
		Node p;
		Node temp = new Node(data);
		
		if(start == null) {
			start = temp;
			return;
		}
		
		 p = start;
		 while(p.link!=null) 
			 p = p.link;
		 
	 p.link = temp;
		 
			 
}

}
