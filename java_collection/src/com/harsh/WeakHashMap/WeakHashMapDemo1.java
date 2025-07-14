package com.harsh.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo1 {
	public static void main(String[] args) throws InterruptedException 
	{
		Product p1 = new Product(111, "Laptop");
		
		WeakHashMap<Product,String> map = new WeakHashMap<>();
        map.put(p1, "Hyd");
        System.out.println(map);
        
        p1 = null;
        
        System.gc();
        
        Thread.sleep(5000);
        
        System.out.println(map);  //{}    
        
	}


}
