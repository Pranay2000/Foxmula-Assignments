package assignment_3;

import java.util.*;

public class CustomException {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter a number as input: ");
		int num = scan.nextInt();
		boolean value = true;
		int remainder;
		if (num == 1 || num == 0){
            System.out.println(num + "::" + " is Valid.");
        }else{	
        	try {
        		for(int i=2; i<num/2; i++) {
        			if(num % i == 0){
        				value = false;
        				break;
        			}
        		}
        	
        		if(value && (num % 2 != 0)) {
        			throw new CustomInvalidException();
        		}
        		else { 
        			System.out.println(num + " is a valid number");
        		}
        	}catch(CustomInvalidException e) {
        		System.out.println(e.getMessage());
        	}
        }
	}
}
