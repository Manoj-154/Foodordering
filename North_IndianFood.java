//package food;
//import java.util.Scanner;
//import java.util.Map.Entry;
//
//public class North_IndianFood extends South_IndianFood {
//
//
//	@Override
//	public void breakFastSelection() {
//		int northTopCost = 0;
//		String northTopChoice = "";
//		
//		System.out.println();
//		System.out.println("Choose veg items");
//		Items.printnorthTopMap();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean northChoicevalidation = false;
//		while(!northChoicevalidation) {
//			System.out.println("\n select Kind of item looking for:");
//			northTopChoice = sc.nextLine();
//			if(Items.getnorthMenu().containsKey(northTopChoice)) {
//				northTopCost = Items.getnorthMenu().get(northTopChoice);
//			
//			northChoicevalidation = true;
//			}
//			else {
//				northChoicevalidation = false;
//				System.out.println("Please,type as you seen above ");
//			}
//		}
//		
//		totalCost = totalCost + northTopCost;
//		System.out.println("\n selected item : " + northTopChoice);
//		System.out.println("total  price : " + totalCost);
//	}
//	
//}

package food;
import java.util.Scanner;
import java.util.Map.Entry;

public class North_IndianFood extends South_IndianFood {
	public int totalCost;

	@Override
	public void breakFastSelection() {
		int vegCost = 0;
		String vegChoice = "";
		
		System.out.println();
		System.out.println("Choose veg items");
		Items.printnorthMenu();
		
		Scanner sc = new Scanner(System.in);
		
		boolean vegvalidation = false;
		while(!vegvalidation) {
			System.out.println("\n select Kind of item looking for:");
			vegChoice = sc.nextLine();
			if(Items.getnorthMenu().containsKey(vegChoice)) {
				vegCost = Items.getnorthMenu().get(vegChoice);
			
			vegvalidation = true;
			}
			else {
				vegvalidation = false;
				System.out.println("Please,type as you seen above ");
			}
		}
		
		totalCost = totalCost + vegCost;
		System.out.println("\n selected item : " + vegChoice);
		System.out.println("total  price : " + totalCost);
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