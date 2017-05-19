package com.practise;

public class Test {

	public String name;
	public int id;
	public int rollNo;

	public Test(String name, int id, int rollNo) {
		super();
		this.name = name;
		this.id = id;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
