package com.cg.dayfour.accessmain;

import com.cg.dayfour.accessmethod.AccessMethod1;

public class AccessMain {

	public static void main(String[] args) {
		AccessMethod1 a = new AccessMethod1();
		System.out.println(a.name);
		//private
//		System.out.println(a.id);
		
		//default
//		System.out.println(a.mobile);
		
		//protected
//		System.out.println(a.mail);

		//Only Public variable is called from another package
		
		//Methods
		
		a.display2();
		
		//only public methods calls
	}

}