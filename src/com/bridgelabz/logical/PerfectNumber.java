package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		long n, sum=0;  
		Scanner scan=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=scan.nextLong();  
		int i=1;  
		//executes until the condition becomes false  
		while(i <= n/2)  
		{  
		if(n % i == 0)  
		{  
		//calculates the sum of factors  
		sum = sum + i;  
		} //end of if  
		//after each iteration, increments the value of variable i by 1  
		i++;  
		} //end of while  
		//compares sum with the number  
		if(sum==n)  
		{  
		System.out.println(n+" is a perfect number.");  
		}  
		else   
		System.out.println(n+" is not a perfect number.");   

	}

}
