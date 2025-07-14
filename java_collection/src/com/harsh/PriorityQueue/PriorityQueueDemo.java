package com.harsh.PriorityQueue;

import java.util.PriorityQueue;

//Methods :-
//----------
//public boolean offer(E e) /public boolean add(E e) :- Used to add an element in the Queue
//
//public E poll()  :- It is used to fetch the elements from head of the queue, after fetching it will delete the element.
//
//
//public E peek()  :- It is also used to fetch the elements from head of the queue, Unlike poll it will only fetch but not delete the element.
//
//public boolean remove(Object element) :- It is used to remove an element. The return  type is boolean. 

public class PriorityQueueDemo {
	public static void main(String[] argv) {
		PriorityQueue<Object> pq = new PriorityQueue<>();
		pq.add("Orange");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Guava");
		pq.add("Grapes");

		// pq.add(null); // Inavlid
		// pq.add(23); //Invalid
		System.out.println(pq);

	}

}
