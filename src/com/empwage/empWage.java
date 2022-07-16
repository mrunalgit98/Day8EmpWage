package com.empwage;

import java.util.Scanner;

//Refactor the Code to write a Class Method to Compute Employee Wage - Use Class Method and Class Variables

public class empWage{
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;
	
	public static void employeeWage() {
		
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
		
		int empType=(int)Math.floor(Math.random()*10%2);
		switch(empType) {
		
		case IS_FULL_TIME: 
			System.out.println("EMPLOYEE IS FULL TIME");
			empHrs=8;
			break;
		case IS_PART_TIME:
			System.out.println("EMPLOYEE IS PART TIME");
			empHrs=4;
			break;
			
			default:
				System.out.println("EMPLOYEE IS ABSENT");
				empHrs=0;
			
		}
		totalEmpHrs+=empHrs;
		System.out.println("DAYS " +totalWorkingDays + "EMP HRS " + empHrs);
		}
		int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		System.out.println("EMPLOYEE WAGE  " +totalEmpWage);
		
		
	}
	public static void main(String[] args) {
		
		
		employeeWage();
	}
}

