package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter number 1 : ");
	double m=sc.nextDouble();
	System.out.print("Enter number 2 : ");
	double n=sc.nextDouble();
	double d=m*n;

	if(m>0 && n>0){
		System.out.print(d + " is positiv ");
	}
	else if(m<0 && n<0){
		System.out.print(d + " is positiv ");
	}
	else if(m>0 && n<0){
		System.out.print(d + " is negativ ");
	}
	else if(m<0 && n>0){
		System.out.print(d + " is negativ ");
	}
	else{
		System.out.print(" Zero ");
		}

    }
}
