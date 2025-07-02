package com.harsh.Collection.list;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Vector;

class Concurrent extends Thread // java.util.concurrent
{
	private Vector<String> cities = null;

	public Concurrent(Vector<String> cities) {
		super();
		this.cities = cities;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		// to modify after the creation of Itearator
		cities.add("Ameerpet");
	}

}

public class FailFastIteartor {
	public static void main(String[] args) throws InterruptedException {
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Bhubneswar");
		listOfCity.add("Kolkata");

		Concurrent c1 = new Concurrent(listOfCity);
		c1.start();

		Iterator<String> itr = listOfCity.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(500);
		}

		System.out.println(".................");
		Spliterator<String> spliterator = listOfCity.spliterator();
		spliterator.forEachRemaining(System.out::println);

	}

}
