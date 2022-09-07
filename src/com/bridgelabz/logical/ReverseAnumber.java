package com.bridgelabz.logical;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		int num=0;
	      int reversenum =0;
	      System.out.println("Input your number : ");
	      Scanner scan = new Scanner(System.in);
	      num = scan.nextInt();
	      //While Loop: Logic to find out the reverse number
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);

	}

}
