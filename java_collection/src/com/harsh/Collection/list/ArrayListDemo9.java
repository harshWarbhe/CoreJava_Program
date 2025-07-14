package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo9 {
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
        //public List subList(int fromIndex, int toIndex)
        List<Integer> subList = list.subList(2, 5);   
        System.out.println(subList);
        
        System.out.println("........................");
         
        //public boolean contains(Object obj)
        boolean contains = list.contains(99);
        System.out.println(contains);
        
        System.out.println("........................");
        
        //public int indexOf(Object obj)
        System.out.println(list.indexOf(5));  
        
        System.out.println("................");
        
        //public void removeIf(Predicate<T> p)
        list.removeIf(num -> num%2==0);
        list.forEach(System.out::println);
                        
	}

}
