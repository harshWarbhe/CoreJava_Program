//want to compare two Objects based on the content but not based on the memory address
//then we should override equals(Object obj) method from Object class
package com.harsh.Collection.Set;

class Customer1 {
	private int customerId;
	private String customerName;

	public Customer1(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public int hashCode() {
		return this.customerId;
	}

	@Override
	public boolean equals(Object obj) {
		// 1st Object data
		int id1 = this.customerId;
		String name1 = this.customerName;

		// 2nd Object data
		Customer1 c2 = (Customer1) obj;
		int id2 = c2.customerId;
		String name2 = c2.customerName;

		if (id1 == id2 && name1.equals(name2)) {
			return true;
		} else {
			return false;
		}

	}

}
public class EqualsDemo2 {
	public static void main(String[] args) 
	{
		Customer1 c1 = new Customer1(111, "Scott");
		Customer1 c2 = new Customer1(111, "Scott");
		
		System.out.println(c1.equals(c2));	//true 
		
		System.out.println(c1.hashCode()+" : "+c2.hashCode());	//111 : 111
		

	}

}
