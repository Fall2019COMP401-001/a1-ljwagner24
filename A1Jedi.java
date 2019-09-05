package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		String [] groceries = new String [count];
		
		for (int i = 0; i < groceries.length; i++) {
			groceries[i] = scan.next();
			scan.nextDouble();
		}
		
		int count2 = scan.nextInt();
		int [] peopleCount = new int [count];
		int [] groceryCount = new int [count];
		
		
		for(int i = 0; i < count2; i++) {
			scan.next();
			scan.next();
			int Quantity = scan.nextInt();
			for(int j = 0; j < Quantity; j++) {
				int num = scan.nextInt();
				 String fruit = scan.next();
				for(int k = 0; k < groceries.length; k++) {
						if (fruit.equals(groceries[k])) {
							groceryCount[k] += 1 * num;
							peopleCount[k] += 1;
							break;
						} else {
						}
				}
			
			}
			
		}
scan.close();

for(int i = 0; i < groceryCount.length; i++) {
	if (groceryCount[i] == 0) {
		System.out.println("No customers bought " + groceries[i]);
	} else {
		System.out.println(peopleCount[i] + " customers bought " + groceryCount[i] + " " + groceries[i]);
	}
}
	}


}
