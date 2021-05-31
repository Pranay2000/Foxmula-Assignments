package assignment_2;

import java.util.*;

public class ElementsOccurence {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		
		while(true){
            System.out.println("Press 1 to add numbers or 0 to exit: ");
            int choice = scan.nextInt();
            if (choice == 0){
                break;
            }
            numbers.add(choice);
        }
		scan.close();
		for(int i=0; i<numbers.size(); i++){
            int element = numbers.get(i);
            int freq = Collections.frequency(numbers, element);
            System.out.println(element + " occurs " + freq + " times.");
        }
    }
}
