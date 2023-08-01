package com.cg.dayseven;

public class RBI {
	private float result;
	float interest(int p, int n) {
		float r = 6.5f;
		result = (p*n*r)/100;
		return result;
	}
	

}
class SBI extends RBI{
	private float result;
	float interest(int p, int n) {
		float r = 6f;
		result = (p*n*r)/100;
		return result;
	}
}
class IOB extends RBI{
	private float result;
	float interest(int p, int n) {
		float r =4.5f;
		result = (p*n*r)/100;
		return result;
		
	}
}

