package monstar.controller;

import monstar.model.MarshmallowMonstar;

public class MonstarController
{
	
	private MarshmallowMonstar firstMonstar;
	
	public MonstarController()
	
	{
		firstMonstar = new MarshmallowMonstar ("Rocky", 2.2, 8, 8, 4, false);
		
	}
	
	public void start()
	
	{
		System.out.println ("We made monsters today!");
		System.out.println("Here is my " + firstMonstar);
		System.out.println("it has " + firstMonstar.getEyeCount() + " Eyes!");
		System.out.println("it has " + firstMonstar.getAntennaCount() + " antenne!");
		System.out.println("it has " + firstMonstar.getLegCount() + " legs!");
		System.out.println("it has " + firstMonstar.getNoseCount() + " noses!");
		System.out.println("it has " + firstMonstar.getHasBellyButton() + " legs!");
		System.out.println("it's name is " + firstMonstar.getName() + " scary!");
		
		
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
