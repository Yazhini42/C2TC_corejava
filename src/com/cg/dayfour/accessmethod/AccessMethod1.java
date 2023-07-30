package com.cg.dayfour.accessmethod;

public class AccessMethod1 {
	public String name = "Yazhini";
	private int id = 101;
	protected String mail = "yazhini24@gmail.com";
	long mobile = 8765432;
	
	void display1() {
		System.out.println("default");
	}
	public void display2() {
		System.out.println("public");
	}
	private void display3() {
		System.out.println("private");
	}
	protected void display4() {
		System.out.println("Protected");
	}
	
}

