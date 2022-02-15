package food;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map.Entry;

public class South_IndianFood {
	
	public int totalCost;
	static ArrayList<Integer> amt = new ArrayList<Integer>();
	
	

	public void nonVegSelection() {
		
		int nonVegCost = 0;
		String idliChoice = "";
		System.out.println("Choose Non-Veg Items below");
		Items.printnonVegMenu();
		
		Scanner sc = new Scanner(System.in);
		
		boolean nonVegvalidation = false;
		while(!nonVegvalidation) {
			System.out.println("\nPlease enter your choice of Southfood: ");
			idliChoice = sc.nextLine();
			if(Items.getnonVegMenu().containsKey(idliChoice)) {
				nonVegCost = Items.getnonVegMenu().get(idliChoice);
				nonVegvalidation = true;
			}
			else {
				nonVegvalidation = false;
				System.out.println("type exactly as you seen above:");
				
			}
		}
		
		totalCost = totalCost + nonVegCost;
		System.out.println("\n Food you orderd : " + idliChoice);
		System.out.println(" Total Price: " + totalCost);
	}
	
	
	public void breakFastSelection() {
		
		int breakFastCost = 0;
		String breakFastChoice = "";
		
		System.out.println("\nChoose any tiffin Items If you want !! : ");
		Items.printsouthMenu();
		
		Scanner sc = new Scanner(System.in);
		
		boolean breakFastvalidation = false;
		while(!breakFastvalidation) {
			System.out.println("\nPlease enter your Tiffin Item: ");
			breakFastChoice = sc.nextLine();
			if(Items.getMasalaMenu().containsKey(breakFastChoice)) {
				breakFastCost = Items.getMasalaMenu().get(breakFastChoice);
				breakFastvalidation = true;
			}
			else {
				breakFastvalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + breakFastCost;
		System.out.println("\n Breakfast Item you Orderd: " + breakFastChoice);
		System.out.println(" Food price for all: " + totalCost);
	}
	
	public void Numberoforders() {
		System.out.println("\n How many plates  you want: ");
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();
		totalCost = totalCost * choice;
		if(choice == 1) {
			System.out.println("\nYou have choosen for " + choice + " Members");
		}
		else {
			System.out.println("\nYou have choosen for " + choice + " Members");
		}
		System.out.println("\n cost for your ordered items is: " + totalCost);
		amt.add(totalCost);
	}
	public int finalAmount() {
		int finalAmount = 0;
		int i;
		
		for (i = 0; i < amt.size(); i++) {
			finalAmount +=  amt.get(i);
		}
             
		return finalAmount;
	}
}