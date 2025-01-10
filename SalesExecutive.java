package com.arrayop;


public class SalesExecutive extends Employee {
	 private double TravAllo;
	    
	 
		public SalesExecutive(int empId, String name, int basicSal, double hra, double da, double travAllo) {
			super(empId, name, basicSal, hra, da);
			this.TravAllo = travAllo;
		}

		@Override
		public double calculateSal() {
			// TODO Auto-generated method stub
			return super.calculateSal()+TravAllo;
		}
	    
		public void print() {
			// TODO Auto-generated method stub
			super.printInfo();
			System.out.println( "Salesexe Travalo "+TravAllo);
			System.out.println("Salesexe Total Sal :"+calculateSal());
		}
}
