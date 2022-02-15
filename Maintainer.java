package food;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maintainer {
	public void adminbox() throws IOException {
		System.out.println("\n");
		System.out.println("a. see Items and it's cost");
		System.out.println("b. change the Cost of item");
		System.out.println("c. Add more items");
		System.out.println("d. Delete items from site");
		System.out.println("e. logout");
		
		
		Scanner sc = new Scanner(System.in);
		String choice =sc.nextLine();
		
		switch(choice) {
		case "a":
			viewItemsandcost();
			break;
		case "b":
			Changeitemcost();
			break;	
		case "c":
			Additems();
			break;
		case "d":
			Deleteitems();
			break;
		case "e":
			Options option = new Options();
			option.option();
			break;	
		}		
	}
	

	public void Changeitemcost() throws IOException {
		System.out.println("\n Select  the list of items to change their cost");
		System.out.println("a. upma");
		System.out.println("b. idli");
		System.out.println("c. Masalachanna");
		System.out.println("d. Pesarattu");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case "a":
			String upmaKey = "";
			int newupmaCost = 0;
			
			Items.printnonVegMenu();
			
			System.out.println("\nEnter the Item of which the price should be change: ");
			upmaKey = br.readLine();
			System.out.println("Enter the new price: ");
			newupmaCost = Integer.parseInt(br.readLine());
			Items.nonVegMenu.replace(upmaKey, newupmaCost);
			System.out.println("\nThe modified cost of " + upmaKey + " is " + Items.getnonVegMenu().get(upmaKey));
			adminbox();
			break;
		case "b":
			String idliKey = "";
			int newidliCost = 0;
			
			Items.printidliMap();
			
			System.out.println("\nEnter the Item for which the price should be Changed: ");
			idliKey = br.readLine();
			System.out.println("Enter the new price: ");
			newidliCost = Integer.parseInt(br.readLine());
			Items.idliMenu.replace(idliKey, newidliCost);
			System.out.println("\nThe modified cost of " + idliKey + " is " + Items.getidliMap().get(idliKey));
			adminbox();
			break;
		case "c":
			String southTopKey = "";
			int newsouthTopCost = 0;
			
			Items.printsouthMenu();
			
			System.out.println("\nSelect the item to which  you want to change the price: ");
			southTopKey = br.readLine();
			System.out.println("Enter the new price: ");
			newsouthTopCost = Integer.parseInt(br.readLine());
			Items.MasalaMenu.replace(southTopKey, newsouthTopCost);
			
			
			System.out.println("\nThe modified cost of " + southTopKey + " is " + Items.getMasalaMenu().get(southTopKey));
//			adminbox();
			break;
		case "d":
			String northTopKey = "";
			int newNorthTopCost = 0;

			Items.printnorthMenu();
			
			System.out.println("\nEnter the non veg base topping for which the price should be modified: ");
			northTopKey = br.readLine();
			System.out.println("Enter the new price: ");
			newNorthTopCost = Integer.parseInt(br.readLine());
			Items.specialMenu.replace(northTopKey, newNorthTopCost);
			System.out.println("\nThe modified cost of " + northTopKey + " is " + Items.getnorthMenu().get(northTopKey));
			
			
			adminbox();
			break;
		}		
	}
	
	public void Additems() throws IOException {
		System.out.println("Choose the items below to be added");
		System.out.println("a. upma");
		System.out.println("b. idli");
		System.out.println("c. Masalachanna");
		System.out.println("d. Pesarattu");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case "a":
			String upmaPlate = "";
			int newUpmaPrice = 0;
			Items.printnonVegMenu();
			System.out.println("\nEnter the new upma type: ");
			upmaPlate = br.readLine();
			System.out.println("Enter the price for new type of upma: ");
			newUpmaPrice = Integer.parseInt(br.readLine());
			Items.nonVegMenu.put(upmaPlate, newUpmaPrice);
			System.out.println("\nThe crust type " + upmaPlate + " has been added with the price of " + Items.getnonVegMenu().get(upmaPlate));
			adminbox();
			break;
		case "b":
			String idliPlate = "";
			int newIdliPrice = 0;
			Items.printidliMap();
			
			System.out.println("\nEnter new type of idli: ");
			idliPlate = br.readLine();
			System.out.println("Enter the new price: ");
			newIdliPrice = Integer.parseInt(br.readLine());
			Items.idliMenu.put(idliPlate, newIdliPrice);
			System.out.println("\n Idli type " + idliPlate + " has been added with the price of " + Items.getMasalaMenu().get(idliPlate));
			
			adminbox();
			break;
		case "c":
			String SouthTopKey = "";
			int newSouthTopCost = 0;
			Items.printsouthMenu();
			
			System.out.println("\nEnter the new South Item: ");
			SouthTopKey = br.readLine();
			System.out.println("Enter the new price: ");
			newSouthTopCost = Integer.parseInt(br.readLine());
			Items.MasalaMenu.put(SouthTopKey, newSouthTopCost);
			System.out.println("\nThe Masalachanna " + SouthTopKey + " has been added with the price of " + Items.getMasalaMenu().get(SouthTopKey));
		
			adminbox();
			break;
		case "d":
			String northTopKey = "";
			int newNorthTopCost = 0;
			Items.printnorthMenu();
			
			System.out.println("\nEnter the new North: ");
			northTopKey = br.readLine();
			System.out.println("Enter the new price: ");
			newNorthTopCost = Integer.parseInt(br.readLine());
			Items.MasalaMenu.put(northTopKey, newNorthTopCost);
			System.out.println("\nThe Pesarattu " + northTopKey + " has been added with the price of " + Items.getnorthMenu().get(northTopKey));
			
			
			adminbox();
			break;
		}		
	}
	
	public void Deleteitems() throws IOException {
		System.out.println("Select the Food item to be delete ");
		System.out.println("a. Upma");
		System.out.println("b. idli");
		System.out.println("c. Masalachanna");
		System.out.println("d. Pesarattu");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case "a":
			String upmaKey = "";
			Items.printnonVegMenu();
			
			System.out.println("\n Enter the upma type to  delete from list : ");
			upmaKey = br.readLine();
			Items.nonVegMenu.remove(upmaKey);
			
			
			System.out.println("\nThe upma type " + upmaKey + " had  deleted");
			adminbox();
			break;
		case "b":
			String idliKey = "";
			Items.printidliMap();
			
			System.out.println("\nEnter the idli type to delete : ");
			idliKey = br.readLine();
			Items.idliMenu.remove(idliKey);
			System.out.println("\nThe idli type " + idliKey + " had  deleted");
			adminbox();
			break;
		case "c":
			String southTopKey = "";
			
			Items.printsouthMenu();
			
			System.out.println("\nEnter the South Item to delete : ");
			southTopKey = br.readLine();
			Items.MasalaMenu.remove(southTopKey);
			System.out.println("\nThe Masalachanna " + southTopKey + " had deleted");
			adminbox();
			break;
		case "d":
			String northTopKey = "";
			Items.printnorthMenu();
			
			System.out.println("\nEnter the South Item to be deleted: ");
			northTopKey = br.readLine();
			Items.MasalaMenu.remove(northTopKey);
			System.out.println("\nThe Pesarattu " + northTopKey + " had deleted");
			adminbox();
			break;
		}		
	}
	
	
	public void viewItemsandcost() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Choose the Items to be viewed");
		System.out.println("a. Non-veg");
		System.out.println("b. idli");
		System.out.println("c. Masala Channa");
		System.out.println("d. Special-Items");

		String choice = sc.nextLine();
		
		switch(choice) {
		case "a":
			Items.printnonVegMenu();
			adminbox();
			break;
		case "b":
			Items.printidliMap();
			adminbox();
			break;
		case "c":
			Items.printsouthMenu();		
			adminbox();
			break;
			
		case "d":
			Items.printnorthMenu();
			adminbox();
			break;
		}
	}
}




