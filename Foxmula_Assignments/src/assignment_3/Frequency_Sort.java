package assignment_3;

import java.util.*;

public class Frequency_Sort {

	static void countOccurences(int[] array, int size) {
		
		Map<Integer, Integer> hashMap = new LinkedHashMap<>();
		
		for(int i=0; i<size; i++) {
			if(hashMap.containsKey(array[i])) {
				hashMap.put(array[i], hashMap.get(array[i]) + 1);
				
			}else {
				hashMap.put(array[i], 1);
			}
		}
		
		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        
    	Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> c1, Map.Entry<Integer, Integer> c2)
            {
                return (c1.getValue()).compareTo(c2.getValue());
            }
        });
        
		for(Map.Entry<Integer, Integer> entry : list)
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the size of Array: ");
		int size = scan.nextInt();
		int[] array = new int[size];
		int len = array.length;
		while(true) {
			System.out.println("\n1.Add Elements to the Array");
			System.out.println("2.Show Frequency of each element");
			System.out.println("3.Exit");
			System.out.println("\n\nEnter your choice:");
			int choice = scan.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("\nEnter the elements of the Array:");
					for(int i=0; i<size; i++) {
						array[i] = scan.nextInt();
					}
					break;
				
				case 2:
					countOccurences(array, len);
					break;
					
				default:
					System.out.println("Exiting!!");
					return;
			}
		}
	}
}