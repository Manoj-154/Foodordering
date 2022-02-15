package food;

import java.util.Scanner;

public class User {
	private South_IndianFood southfood;
	private North_IndianFood northfood;
	
	public void order() {
		
		boolean foodIteration = true;
		
		System.out.println("Type your name below:");
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		System.out.println("Enter your ph.No below:");
		Scanner sc1=new Scanner(System.in);
		Long ph=sc1.nextLong();
		System.out.println("Tell us your Address:");
		Scanner sc2=new Scanner(System.in);
		String add=sc2.nextLine();
		
		
		while(foodIteration) {
			System.out.println("\nEnter the type of Food");
			System.out.println("a. SouthFood");
			System.out.println("b. NorthFood");
			
			Scanner obj = new Scanner(System.in);
			String choice = obj.nextLine();
			
			switch(choice) {
				case "a":
					southfood = new South_IndianFood();
					southfood.nonVegSelection();
					southfood.Numberoforders();

						System.out.println("\nThanks for your order, Njoy your food !!!");
						System.out.println();
						System.out.println("The overall cost of your order is " + southfood.finalAmount());
						System.out.println();
						System.out.println("your name: "+username);
						System.out.println("Phone num: "+ph);
						System.out.println("Delivery Address: "+add);
						System.out.println("Your food is on the way get ready to collect it ");
						foodIteration = false;

					break;
				case "b":					
					northfood = new North_IndianFood();
					northfood.breakFastSelection();
						northfood.Numberoforders();
						System.out.println("\nThanks for your order, Njoy your food !!!");
						System.out.println();
						System.out.println(" cost of your order is: " + northfood.finalAmount());
						System.out.println();
						System.out.println("your name: "+username);
						System.out.println("Phone num: "+ph);
						System.out.println("Delivery Address:"+add);
						System.out.println("Your food is on the way get ready to collect it ");
						foodIteration = false;						
					break;
			}
		}		
	}
}