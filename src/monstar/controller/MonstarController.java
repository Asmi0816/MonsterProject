package monstar.controller;

import monstar.model.MarshmallowMonstar;
import java.util.Scanner;

public class MonstarController
{
	
	private MarshmallowMonstar firstMonstar;
	private Scanner keyBoardInput;
	
	public MonstarController()
	
	{
		firstMonstar = new MarshmallowMonstar ("Rocky", 2.2, 8, 8, 4, false);
		keyBoardInput = new Scanner(System.in);
	}
	
	public void start()
	
	{
		System.out.println ("We made monsters today!");
		System.out.println("Here is my " + firstMonstar);
		System.out.println("it's name is " + firstMonstar.getName() + ", scary!");
		System.out.println("it has " + firstMonstar.getAntennaCount() + " antenne!");
		System.out.println("it has " + firstMonstar.getEyeCount() + " Eyes!");
		System.out.println("it has " + firstMonstar.getLegCount() + " legs!");
		System.out.println("it has " + firstMonstar.getNoseCount() + " noses!");
		System.out.println("it is " + firstMonstar.getHasBellyButton() + " to think the monstar has a belly button.");
		
		
		
		System.out.println("do you want to chane my monsars name?");
		String answer = keyBoardInput.nextLine();
		
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Fine you jerk, what would you name him?");
			String newName = keyBoardInput.nextLine();
			firstMonstar.setName(newName);
		}
		else
		{
			System.out.println("Good because he's my monstar not yours!!!");
		}
		System.out.println(firstMonstar);
		
		
		
		
		
		
		
		
	}
	


}
