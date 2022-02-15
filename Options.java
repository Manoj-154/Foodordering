package food;

import java.io.IOException;
import java.util.Scanner;

public class Options {
	public void option() throws IOException {
		System.out.println();
		System.out.println("Carefully Choose the options value and give an input accordingly ");
		System.out.println();
		System.out.println("Choose(a) for USER");
		System.out.println("           or                  ");
		System.out.println("Choose(b) for ADMIN");
		System.out.println();
		
		System.out.println("USER");
		System.out.println("ADMIN");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = sc.nextLine();
		
		switch(choice) {
		case "a":
			User user = new User();
			user.order();
			break;
		case "b":
			Maintainer admin = new Maintainer();
			admin.adminbox();
			break;
		}
	}
}