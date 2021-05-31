package assignment_2;

import java.util.*;
public class Count_Pairs {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(7);
        array.add(2);
        array.add(3);
        array.add(6);
        array.add(8);
        array.add(9);
        array.add(10);
        
        System.out.println("ArrayList is: ");
        for(int i : array)
        	System.out.print(i + " ");
      
        Collections.sort(array);
        System.out.println();
        
        while(true) {
        	Scanner scan = new Scanner(System.in);
            System.out.println("1.Enter value to find pairs.\n2.Exit ");
            int k = scan.nextInt();
            if(k == 2)
            	System.exit(1);
            
            System.out.print("\nEnter the value of k: ");
            k = scan.nextInt();
            int status = 0;
            int start = 0, end = array.size()-1;
            while(start < end) {
                if(array.get(start) + array.get(end) == k) {
                    System.out.println("Pair: (" + array.get(start) + "," + array.get(end) + ")");
                    status = 1;
                }
                if(array.get(start) + array.get(end) > k) {
                    end--;
                }
                else {
                    start++;
                }
            }
            if(status == 0) {
                System.out.println("No pair");
            }
        }
	}
}