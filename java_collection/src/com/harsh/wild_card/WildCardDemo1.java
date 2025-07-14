package com.harsh.wild_card;

import java.util.ArrayList;


//a) <? extends Animal>  :  
//
//This is upper bound here we can replace                   
//wild-card (?) with any class which extends Animal but here there is a chance of wrong
//collection in the future because in future Animal can have more sub classes so, we can't
//add any element in the Collection.
//
//
//b) <? super Dog>  : 
//
//This is called lower bound, Here we can replace wild card (?) with with any class which is
//super of Dog i.e Animal, Object. Here compiler knows that the only classes which are super
//of Dog are allowed so adding element in the collection is allowed.

class Animal {

}

class Dog extends Animal {
}

class Horse extends Animal {
}

public class WildCardDemo1 {

	public static void main(String[] args) {
		ArrayList<? super Dog> list = new ArrayList<Object>();
		list.add(new Dog());

		ArrayList<? extends Animal> list1 = new ArrayList<Horse>();
		//list1.add(new Horse()); // error [Not allowed]
	}

}
