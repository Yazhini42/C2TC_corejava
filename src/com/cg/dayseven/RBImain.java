package com.cg.dayseven;

public class RBImain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//IOB i = new IOB();
				//i.bank();
				//SBI s = new SBI();
//				RBI r = new RBI();
				//r.bank();
				int principle = 1000;
				int time = 3;
				RBI r;
				r = new RBI();
				System.out.println("RBI interest "+r.interest(principle,time));
				SBI s;
				s = new SBI();
				System.out.println("SBI interest "+s.interest(principle, time));
				IOB i;
				i = new IOB();
				System.out.println("IOB interest "+i.interest(principle, time));
				
				
				

			}

}