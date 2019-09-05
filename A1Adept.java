package a1;

import java.util.Scanner;

public class A1Adept {


	public static void main(String[] args) {
		
				
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		int values;
		
		String [] groceries = new String [count];
		double [] prices = new double[count];
		for (int i = 0; i < count; i++) {
			groceries[i] = scan.next();
			prices[i] = scan.nextDouble();
		} 
		
		int count2 = scan.nextInt();
		String[] customerFirstName = new String[count2];
		String[] customerLastName = new String[count2];
		int Quantity;
		int [] TotalSpent = new int[count2];
		int index = 0;
		int placeholder = 0;
		
		
		int [] totalItems = new int[10000];
		double [] totalPrices = new double[10000];
		int counter = 0;
		for(int j = 0; j < count2; j++) {
			customerFirstName[j] = scan.next();
			customerLastName[j] = scan.next();
			values = scan.nextInt();
			totalItems[j] = values;
		for (int k = 0; k < values; k++) {
			Quantity = scan.nextInt();
			String fruit = scan.next();
			for(int l = 0; l < groceries.length; l++) {
				if (fruit.equals(groceries[l])) {
					index = l;
	
					double tempprice = prices[index]* (double)Quantity;
					totalPrices[counter] = tempprice;
					counter++;
					
					
				} else {
				}
				
				
			}
			
		}
			
	}
		
//		for(int i = 0; i < totalPrices.length; i++) {
//			if(totalPrices[i] == 0.0) {
//				break;
//			}
//			System.out.println(totalPrices[i]);
//			
//		}
		
	int counter1 = 0;
	double sum [] = new double [10000];
	for(int i = 0; i < totalItems.length; i++) {
		if(totalItems[i] == 0.0) {
			break;
		}
		double sumcounter = 0;
		for(int j = 0; j < totalItems[i]; j++) {
			sumcounter += totalPrices[counter1]; 
			counter1++;
		}
		sum[i] = sumcounter;
	}
	
	for(int i = 0; i < sum.length; i++) {
		if (sum[i] == 0.0) {
			break;
		}
	}
	double max = 0;
	double min = 10000000;
	double average = 0;
	int maxindex = 0;
	int minindex = 0;
	for(int i = 0; i < sum.length; i++) {
		if(sum[i] == 0.0) {
			break;
		}
		average += sum[i];
		
		if(sum[i] > max) {
			max = sum[i];
			maxindex = i;
		} 
		if(sum[i] < min) {
			min = sum[i];
			minindex = i;
		}
	}
	average = average/count2;
	String numberAsString = String.format ("%.2f", average);
	average = Double.parseDouble(numberAsString);
	System.out.println("Biggest: " + customerFirstName[maxindex] + " " + customerLastName[maxindex] + " " + "(" + max + ")");
	System.out.println("Smallest: " + customerFirstName[minindex] + " " + customerLastName[minindex] + " " + "(" + min + ")");
	System.out.println("Average: " + numberAsString);
		
		
		
		scan.close();
	}
}