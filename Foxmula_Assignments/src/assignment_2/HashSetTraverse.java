package assignment_2;

import java.util.*;

public class HashSetTraverse {

	public static void main(String[] args) {

		
		Set<Integer> marks = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nEnter marks for different students: ");
        while(true) {
        	int choice = scan.nextInt();
        	if (choice == 0){
        		break;
        	}
        	marks.add(choice);
        }
        scan.close();
		Iterator<Integer> iter = marks.iterator(); //elements displayed in no particular order
		System.out.print("\nTraversing the HashSet: ");
		while(iter.hasNext())
			System.out.println(iter.next() + " ");
	}
}
