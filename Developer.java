package com.arrayop;

import com.polymorphism1.Employee;

public class Developer extends Employee {
	private double NightShift ;

	public Developer(int empId, String empName, double basicSal, double hra, double da,double nightShift) {
		super(empId, empName, basicSal, hra, da);
		this.NightShift=nightShift;
	}
	
	public double calculateSalary() {
		
		return super.calculateSalary()+NightShift;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Extra Night Shift"+NightShift);
		System.out.println("Salexe total Salary:"+calculateSalary());
	}

}
