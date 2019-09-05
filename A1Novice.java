package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] values = new int[count];
		String [] Customerfirstname = new String [count];
		String [] Customerlastname = new String [count];
		Double [] Costs = new Double [count];
		Double [] costperPerson = new Double [count];
		int Quantity = 0;
		int counter = 0;
		
		
		for (int i=0; i<=count; i++) {
			
			Customerfirstname[i] = scan.next().charAt(0) + ".";
			Customerlastname[i] = scan.next();
			values[i] = scan.nextInt();
			String [] Groceries = new String [values[i]];
			Double [] CostofIngredient = new Double [values[i]];
			counter++;
		 for (int j = 0; j < values[i]; j++ ) {
			Quantity = scan.nextInt();
			Groceries[j] = scan.next();
			CostofIngredient[j] = scan.nextDouble();
			Costs[j] = Quantity * CostofIngredient[j];
			
				
			}
			
		}
		} 
 
		scan.close();
		
		System.out.println(Customerfirstname[0] + Customerlastname[0] + ": " + );
		System.out.println(Customerfirstname[1] + Customerlastname[1] + ": " + costperPerson[1]);
		System.out.println(Customerfirstname[2] + Customerlastname[2] + ":"  +  costperPerson[2]);
		
		
		
		}
}
