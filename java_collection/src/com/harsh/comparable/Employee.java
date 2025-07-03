package com.harsh.comparable;

public record Employee(Integer id, String name) implements Comparable<Employee>{

	@Override
	public int compareTo(Employee e2) {
		return Integer.compare(this.id, e2.id);
	}
	


}
