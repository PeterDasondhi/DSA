package singleLinkedList;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] arg) {
		
		int choice, data, x;
		
		Scanner scan = new Scanner(System.in);
		
		SingleLinkedList list  = new SingleLinkedList();
		
		list.createList();
		
		while(true) {
			System.out.println("1. Display List");
			System.out.println("2. Count the number of node");
			System.out.println("3. Search for an element");
			System.out.println("4. Insert in empty list/Insert in beginning of the List");
			System.out.println("5. Insert a node at the end of the list");
			System.out.println("6. Insert a node after a specified node");
			System.out.println("7. Insert a node before a specified node");
			System.out.println("8. Insert a node at a given position");
			System.out.println("9. Delete first node");
			System.out.println("10. Delete last nodet");
			System.out.println("11. Delete any node");
			System.out.println("12. Reverse the list");
			System.out.println("13. Bubble sort bby exchanging data");
			System.out.println("14. Bubble sort bby exchanging link");
			System.out.println("15. Merge Sort");
			System.out.println("16. Insert Cycle");
			System.out.println("17. Delete Cycle");
			System.out.println("18. Remove Cycle ");
			System.out.println("19. Quit");
			
			
			System.out.println("Enter your choice number : ");
			
			choice = scan.nextInt();
			
			
			if(choice == 19) {
				break;
			}
			
			switch(choice) {
			
			case 1:
				list.displayList();
				break;
			case 2:
				list.countNodes();
				break;
			case 3:
				System.out.println("Enter the element to be search : ");
				data = scan.nextInt();
				list.search(data);
				break;
			case 4:
				System.out.println("Enter the element to be inserted : ");
				data = scan.nextInt();
				list.insertInBeginning(data);
				break;
			case 5:
				System.out.println("Enter the element to be inserted : ");
				data = scan.nextInt();
				list.insertAtEnd(data);
				break;
			case 6:
				System.out.println("Enter the element to be inserted : ");
				data = scan.nextInt();
				System.out.println("Enter the element after which to insert : ");
				x = scan.nextInt();
				list.insertAfter(data, x);
				break;
			case 7:
				System.out.println("Enter the element to be inserted : ");
				data = scan.nextInt();
				System.out.println("Enter the element before which to insert : ");
				x = scan.nextInt();
				list.insertBefore(data, x);
				break;
			case 8:
			System.out.println("Enter the element to be inserted : ");
			data = scan.nextInt();
			System.out.println("Enter the position at which to insert : ");
			x = scan.nextInt();
			list.insertAtPosition(data, x);
				break;
			case 9:
				list.deleteFirstNode();
				break;
			case 10:
				list.deleteLastNode();
				break;
			case 11:
				System.out.println("Enter the element to be inserted : ");
				data = scan.nextInt();
				list.deleteNode(data);
				break;
			case 12:
				list.reverseList();
				break;
			case 13:
//				list.bubbleSortExData();
				break;
			case 14:
//				list.bubbleSortExLink();
				break;
			case 15:
//				list.mergeSort();
				break;
			case 16:
				System.out.println("Enter the element at which the cycle has to be inserted : ");
				data = scan.nextInt();
//				list.insertCycle(data);
				break;
			case 17:
//				if(list.hasCycle()) {
//					System.out.println("List has a cycle");
//				}else {
//					System.out.println("List does not have  a cycle");
//				}
				break;
			case 18:
//				list.removeCycle();
				break;
			default:
					System.out.println("Wrong choice");
			}
		
			System.out.println();
	    }
		scan.close();
		System.out.println("Exiting");
	}
}
