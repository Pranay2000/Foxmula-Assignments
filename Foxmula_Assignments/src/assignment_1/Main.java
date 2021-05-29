package assignment_1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Time t1 = new Time(2, 30, 15);
		Time t2 = new Time(4, 15, 35);
		t1.Add(t2);
		
		Stack stack1 = new Stack();
	    Stack stack2 = new Stack();
	    
	    StackOperations(stack1, stack2);
	    SetCoordinates p1 = new SetCoordinates(10, 20);
	    SetCoordinates p2 = new SetCoordinates(30, 50);
	    SetCoordinates p3 = new SetCoordinates(40, 30);
	    SetCoordinates p4 = new SetCoordinates(10, 0);
	    Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4, 15);
	    
	    p1 = new SetCoordinates(10, 15);
	    p2 = new SetCoordinates(20, 25);
	    p3 = new SetCoordinates(30, 0);
	    p4 = new SetCoordinates(40, 10);
	    Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4, 5);
	    
	    p1 = new SetCoordinates(10.5,12.4);
	    p2 = new SetCoordinates(14.3, 16.2);
	    p3 = new SetCoordinates(18.1, 20);
	    p4 = new SetCoordinates(10, 0);
	    Rectangle rectangle = new Rectangle(p1, p2, p3, p4, 12);
	    
	    p1 = new SetCoordinates(11.5, 13.4); 
	    p2 = new SetCoordinates(15.9, 17.0);
	    p3 = new SetCoordinates(19.2, 21.1);
	    p4 = new SetCoordinates(23.3, 25.7);
	    Square square = new Square(p1, p2, p3, p4, 4);
	    
	    System.out.println(trapezoid.Area() + " is the area of trapezoid");
	    System.out.println(parallelogram.Area() + " is the area of parallelogram");
	    System.out.println(rectangle.Area() + " is the area of rectangle");
	    System.out.println(square.Area() + " is the area of square");
	}
	
	public static void StackOperations(Stack stack1, Stack stack2) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("0. To exit");
			System.out.println("1. Push on first Stack");
			System.out.println("2. Push on second Stack");
			System.out.println("3. Pop from first Stack");
			System.out.println("4. Pop from second Stack");
			System.out.println("5. Check if Stack 1 is empty");
			System.out.println("6. Check if Stack 2 is empty");
			
			System.out.println("\nEnter your choice: ");
			
			int input = scanner.nextInt();
			 if (input == 0) {
	                break;
	            }
	            if (input == 1) {
	                System.out.print("Enter a number to push() in Stack1: ");
	                int number = Integer.parseInt(scanner.nextLine());
	                stack1.push(number);
	            }
	            if (input == 2) {
	                System.out.print("Enter a number to push() in Stack2: ");
	                int number = Integer.parseInt(scanner.nextLine());
	                stack2.push(number);
	            }
	            if (input == 3) {
	                try {
	                    System.out.println(stack1.pop());
	                } catch (NoSuchElementException exp) {
	                    System.out.println("Stack is empty please push first");
	                    continue;
	                }
	            }
	            if (input == 4) {
	                try {
	                    System.out.println(stack2.pop());
	                } catch (NoSuchElementException exp) {
	                    System.out.println("Stack is empty please push first");
	                    continue;
	                }
	            }
	            if (input == 5) {
	                System.out.println(stack1.checkEmpty());
	            }
	            if (input == 6) {
	                System.out.println(stack2.checkEmpty());
	            }
			scanner.close();
			if (AreStacksEqual(stack1, stack2)) {
				System.out.println("Stacks are equal after this operation, there length is: " + stack1.length());
			}
		}
	}
	public static boolean AreStacksEqual(Stack stack1, Stack stack2) {
		return (stack1.length() == stack2.length());
	}
}
