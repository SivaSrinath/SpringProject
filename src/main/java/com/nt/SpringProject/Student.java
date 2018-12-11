package com.nt.SpringProject;

public class Student {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("hi I am in set method");
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}
}