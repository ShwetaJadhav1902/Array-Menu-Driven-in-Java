package com.arrayop;
import java.util.Scanner;
public class MainApp{
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Info How Much Employee Info You Have To Store...");
	int size=sc.nextInt();
	
	Employee arrE[]=new Employee[size];
	//Employee emp=null;
	
	for(int i=1;i<arrE.length;i++) {

		System.out.println("Enter Information !!!");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Enter Employee Id :");
		int id=sc.nextInt();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Enter Employee Name :");
		String name=sc.next();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Enter Employee Basic Salary :");
		int bsal=sc.nextInt();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Enter Employee HomeRentAllowance :");
		double hra=sc.nextDouble();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Enter Employee DA :");
		double da=sc.nextDouble();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Choice one of the Following :"
				+"\n 1.Manager"
				+"\n 2.SalesExecutive");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	   Employee emp=new Employee(id,name,bsal,hra,da);
	   int op=sc.nextInt();
		System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=-=");
		
		if(op==1) {
			System.out.println("Enter Incentive Amount For Manager :");
			double inc=sc.nextDouble();
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			emp=new Manager(id,name,bsal,hra,da,inc);
			emp.printInfo();
		}else if(op==2) {
			System.out.println("Enter Incentive Amount For SalesExecutive :");
			double ta=sc.nextDouble();
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			emp=new SalesExecutive(id,name,bsal,hra,da,ta);
			emp.printInfo();
		}else {
			System.out.println("Invalid Option...!!!!!!");
		}
	   arrE[i]=emp;
	}
	
	for(Employee e:arrE) {
		System.out.println(e);
	}
}
}
