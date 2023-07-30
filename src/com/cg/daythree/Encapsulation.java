package com.cg.daythree;
import java.util.Scanner;
public class Encapsulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 101;
		long mobile = 23123212;
		String name = "Yazhini";
		String email = "Yazhu24@gmail.com";
		EncapsulationMethod e = new EncapsulationMethod(id,name,email,mobile);
		System.out.println(e);
		//get the name
		String getname = e.getName();
		System.out.println(name);
		//set the id
		System.out.print("Enter the new id: ");
		int  n = sc.nextInt();
		e.setId(n);
		System.out.println(e);
		
	}

}