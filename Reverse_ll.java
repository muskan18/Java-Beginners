package day_5;

import java.util.Scanner;

public class Reverse_ll {

	class Node {

		int data;

		Node next;

		Node(int d) {

			data = d;
			next = null;
		}

	}

	static Node root;

	void insert(int num) {

		if (root == null) {

			root = new Node(num);

			return;

		}

		Node tm = root;

		Node newnode = new Node(num);

		while (tm.next != null) {
			tm = tm.next;

		}

		tm.next = newnode;

		newnode.next = null;

	}

	void display(Node r) {

		Node temp = r;

		while (temp != null) {
		
			System.out.print(temp.data + " ==> ");
			
			temp = temp.next;
		}
		System.out.println("null");

		System.out.println();
	}

	Node reverse(Node r) {

		Node prev = null;

		Node current = r;

		Node next = null;

		while (current != null) {

			next = current.next;

			current.next = prev;

			prev = current;

			current = next;

		}

		r = prev;

		return r;

	}

	public static void main(String[] args) {

		Reverse_ll obj = new Reverse_ll();

		Scanner sc = new Scanner(System.in);

		System.out.println("how many elments you want to enter ? ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter "+ (i+1) + " element:");

			obj.insert(sc.nextInt());

		}

		System.out.println("List before reversing ");

		obj.display(obj.root);

		System.out.println("List after reversing ");

		obj.root = obj.reverse(obj.root);

		obj.display(obj.root);

	}

}
