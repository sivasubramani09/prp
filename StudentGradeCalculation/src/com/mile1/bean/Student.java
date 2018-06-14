package com.mile1.bean;

public class Student {
	String name;
	int marks[];

	//Constructor
	public Student(String S, int[] m) {
		name = S;
		marks = m;
	}
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
}
