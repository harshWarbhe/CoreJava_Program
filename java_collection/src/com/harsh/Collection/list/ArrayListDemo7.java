package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization)
{
}

class Department 
{
	private String departmentName;
	private List<Professor> professors;
	
	public Department(String departmentName)
	{
		this.departmentName = departmentName;
		this.professors = new ArrayList<Professor>();//Composition
	}
	
	public void addProfessor(Professor prof)
	{
		this.professors.add(prof);
	}

	public String getDepartmentName()
	{
		return departmentName;
	}

	public List<Professor> getProfessors() 
	{
		return professors;
	}	
}

public class ArrayListDemo7 {
	public static void main(String[] args) 
    {
       
    	Department cs = new Department("Computer Science");
    	cs.addProfessor(new Professor("James", "Java"));
    	cs.addProfessor(new Professor("Scott", "Adv Java"));
    	cs.addProfessor(new Professor("Kishore Sir", "C language"));
    	
    	System.out.println("Professors in :"+cs.getDepartmentName());
    	List<Professor> professors = cs.getProfessors();
    	professors.forEach(System.out::println);
      
    }

}
