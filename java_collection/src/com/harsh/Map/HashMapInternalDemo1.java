package com.harsh.Map;

import java.util.HashMap;
import java.util.Objects;

class Customer
{
	private Integer customerId;
	private String customerName;
		
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

	public Customer(Integer customerId, String customerName) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
   
	@Override
	public int hashCode() {
		return Objects.hash(customerId, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(customerName, other.customerName);
	}  
	
}

public class HashMapInternalDemo1 {
	public static void main(String[] args) 
	{
	   Customer c1 = new Customer(111, "Scott");	
	   Customer c2 = new Customer(111, "Scott");	
	   	   
	   System.out.println(c1.hashCode()+" : "+c2.hashCode());
	   System.out.println(c1.equals(c2)); 
	   
	   System.out.println("..............................");
	   HashMap<Customer,String> map = new HashMap<>();
	   map.put(c1, "A");    //c1 = A  ---> c1 = B
	   map.put(c2, "B");   
	   
	   System.out.println(map.size()); 
	   System.out.println(map); 
	   
	}


}
