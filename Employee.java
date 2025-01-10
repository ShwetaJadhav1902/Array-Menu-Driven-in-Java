package com.arrayop;

public class Employee {

	private int empId;
	private String name;
	private int basicSal;
	private double hra;
	private double da;
	
	public Employee(int Id, String name, int sal, double hra, double da) {
		super();
		this.empId = Id;
		this.name = name;
		this.basicSal = sal;
		this.hra = hra;
		this.da = da;
	}
	
	public double calculateSal() {
		return basicSal+hra+da;
	}
	
	public double addition() {
		return hra+da;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSal=" + basicSal + ", hra=" + hra + ", da=" + da
				+ "]";
	}
	
	
	
	public void printInfo() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(basicSal);
		System.out.println(hra);
		System.out.println(da);
	
	}
	
	
	
}
