package assignment_2;

import java.util.*;

public class SetContains {

	public static void main(String[] args) {

        Set<String> name = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.println("Enter a String to add Press 0 to exit:");
        	String choice = scan.nextLine();
        	if (choice.equals("0")){
        		break;
        	}
            name.add(choice);
        }
        
        System.out.println("\nEnter an element to search in Set: ");
        String checkName = scan.nextLine();
        if(name.contains(checkName)) {
        	System.out.println(checkName + " is present in the Set");
        }else {
        	System.out.println(checkName + " is not present in the Set");
        }
        scan.close();
	}
}