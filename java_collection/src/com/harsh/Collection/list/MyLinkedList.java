package com.harsh.Collection.list;

public class MyLinkedList {
	private static class Node {
		int item;
		Node next;

		public Node(int item) {
			this.item = item;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node node1 = new Node(100);
		Node node2 = new Node(200);
		Node node3 = new Node(300);

		node1.next = node2;
		node2.next = node3;

		System.out.println(node1.item);
		System.out.println(node1.next.item);
		System.out.println(node1.next.next.item);

		System.out.println("........................");

	}

}
