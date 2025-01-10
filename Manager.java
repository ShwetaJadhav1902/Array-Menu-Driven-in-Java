package com.arrayop;

public class Manager extends Employee{
private double inc;
	
	public Manager(int empId, String name, int basicSal, double hra, double da, double inc) {
		super(empId, name, basicSal, hra, da);
		this.inc = inc;
	}

	@Override
	public double calculateSal() {
		
		return super.calculateSal()+inc;
	}

	@Override
	public void printInfo() {
	
		super.printInfo();
	//	System.out.println("manager inc "+empId);
		System.out.println("manager inc "+inc);
		System.out.println("manager Total Sal :"+calculateSal());
	}
}
