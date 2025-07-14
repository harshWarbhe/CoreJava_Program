package com.harsh.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] argv) 
    {
        Map<String,String> map = new TreeMap<String,String>();  
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key1", "value1");

        System.out.println(map); 
        
     }

}
