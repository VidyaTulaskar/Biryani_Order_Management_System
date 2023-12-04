package pack1;

import pack2.FoodMain;



public class Restaurant extends FoodMain
{
	public static void main(String[] args) throws Exception
	{	
		
		FoodMain aobj=new Restaurant();
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("------------------------------WELCOME TO BEST BIRIYANI RESTAURANT------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
		aobj.login();
		aobj.mainMenu();
		
	}

}