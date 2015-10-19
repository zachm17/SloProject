package slo.controller;

import slo.view.SloPopups;

public class SloController
{
	private SloPopups myPopups;
	
	
	public SloController()
	{
		myPopups = new SloPopups();
	}
	
	public void start()
	{
		int n=10;
		
		{
		myPopups.showResponse("N is equal to 10");
		for(n=9; n<10; n++)
		
		myPopups.showResponse("N MIGHT BE 9 BRUV");
		if(n==10)
		{
		myPopups.showResponse("yes N is 10");
		}
		else if(n==10)
		{
			myPopups.showResponse("WHAT THE HAUDADJB");
		}
		else
		{
		myPopups.showResponse("Welp what is N");
		}
		}
	

	myPopups.showResponse("Lets try a double");
	
	double q;

	for(q=16.5; q<18.5; q++)
	{
		if(q==16.5) 
		{
			myPopups.showResponse("q is 16.5");
		}
		
		else if(q==17.5) 
		{
			myPopups.showResponse ("q is 17.5");
		}
		
		else if(q==18.5)
		{
			myPopups.showResponse("we reached the limit");
			
		}
		else 
		{
			myPopups.showResponse("Q is greater than 18.5");
		}
		String Str = new String("Q is still greater than 18.5");
		myPopups.showResponse(Str.substring(10,40));
		myPopups.showResponse(Str.concat("YAYAYAYAY"));
	}
}
}
	
		
		

