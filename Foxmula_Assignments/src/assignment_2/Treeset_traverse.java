package assignment_2;

import java.util.*;
import java.util.TreeSet;


public class Treeset_traverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		TreeSet<String> tree = new TreeSet<>();
		 while(true) {
	        System.out.println("Enter a String to add Press 0 to exit:");
	       	String choice = scan.nextLine();
	       	if (choice.equals("0")){
	       		break;
	       	}
	        tree.add(choice);
		 }
		
		Iterator<String> value = tree.iterator();
        System.out.println("\nValues: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
	}
}