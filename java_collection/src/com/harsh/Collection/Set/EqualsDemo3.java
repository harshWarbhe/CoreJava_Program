//WE SHOULD ALWAYS OVERRIDE HASHCODE AND EQUALS BOTH THE METHODS TOGETHER
//
//All the Wrapper classes and String class have overriden both the methods.
package com.harsh.Collection.Set;

class Product {
	private Integer pid;
	private String pname;

	public Product(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public int hashCode() {
		return this.pid;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product p2 = (Product) obj;

			if (this.pid == p2.pid && this.pname.equals(p2.pname)) {
				return true;
			} else {
				return false;
			}

		} else {
			System.err.println("Comparison is not possible!!");
			return false;
		}
	}

}

class Student3 {
	private int sid;
	private String sname;

	public Student3(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

}

public class EqualsDemo3 {
	public static void main(String[] args) {
		Product p1 = new Product(111, "Scott");
		Student3 s1 = new Student3(111, "Scott");

		System.out.println(p1.equals(s1));
		System.out.println(p1.equals(null));

		System.out.println("..............");
		Product p2 = new Product(222, "Scott");
		System.out.println(p1.equals(p2));

	}

}
