package day_6;

import java.util.Scanner;

class PairSumlinkedlist {

	static class Node {
		
		int data;

		Node next, prev;

	};

	static void pairSum(Node head, int x) {
		
		Node first = head;

		Node second = head;

		while (second.next != null)
			second = second.next;

		boolean found = false;

		while (first != null && second != null && first != second && second.next != first) {
			if ((first.data + second.data) == x) {
				found = true;

				System.out.println("(" + first.data + ", " + second.data + ")");

				first = first.next;

				second = second.prev;
			} else {
				if ((first.data + second.data) < x)
					first = first.next;

				else
					second = second.prev;
			}
		}

		if (found == false)
			System.out.println("No pair found");
	}

	static Node insert(Node head, int data) {

		Node temp = new Node();

		temp.data = data;

		temp.next = temp.prev = null;

		if (head == null)
			(head) = temp;
		else {
			temp.next = head;

			(head).prev = temp;

			(head) = temp;
		}

		return temp;
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		Node head = null;

		System.out.println("How many nodes you want to enter ? ");

		int n = sc.nextInt();

		System.out.println("Enter the nodes");

		for (int i = 0; i < n; i++) {
		
			int ele = sc.nextInt();
			
			head = insert(head, ele);
		}

		System.out.println("Enter the sum");

		int s = sc.nextInt();

		pairSum(head, s);
	
		sc.close();
	}

	

}