package com.bridgelabz.logical;

import java.util.Scanner;

public class Stopwatch {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long start,end;
		double time;
		System.out.println("Type any character to start the stopwatch");
		char s=scan.next().charAt(0);
		start=System.currentTimeMillis();
		System.out.println("Type any character to stop the stopwatch");
		char m=scan.next().charAt(0);
		end=System.currentTimeMillis();
		time=(end-start)/1000.0;
		System.out.println("Elapsed Time is :" +time);
	}

}
