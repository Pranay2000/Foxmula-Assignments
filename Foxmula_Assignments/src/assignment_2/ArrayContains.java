package assignment_2;

import java.util.*;

public class ArrayContains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		while(true) {
			System.out.println("Enter a number to add Press 0 to exit:");
			int choice = scan.nextInt();
			if (choice == 0){
				break;
			}
			num.add(choice);
		}
		
		System.out.print("\nEnter an element to search in the ArrayList: ");
		int checkNum = scan.nextInt();
		if(num.contains(checkNum)) {
			System.out.println(checkNum + " is present");
		}else {
			System.out.println(checkNum + " is not present");
		}
		scan.close();
	}
}
