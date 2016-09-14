package monstar.controller;

import monstar.model.MarshmallowMonstar;

public class MonstarController
{
	
	private MarshmallowMonstar firstMonstar;
	
	public MonstarController()
	
	{
		firstMonstar = new MarshmallowMonstar ("Rocky", 24768.4, 5, 45, 4, true);
		
	}
	
	public void start()
	
	{
		System.out.println ("We made monsters today!");
		System.out.println("Here is my " + firstMonstar);
	}
	
	/*
	 * Monster name is Rocky
	 * has 2.2 antenna
	 * has 4 legs
	 * has 2 noses
	 * has 8 eyes
	 * does have belly button
	 */

}
