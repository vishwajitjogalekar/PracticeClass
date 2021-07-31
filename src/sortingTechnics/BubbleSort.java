package sortingTechnics;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int size = 0;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of data");
		size=sc.nextInt();
		int[] data =new int[size];
		
		// Enter data into array
		System.out.println("Enter data to sort");
		for (int i = 0; i < data.length; i++) {
			data[i]=sc.nextInt();
		}
		
		//Bubble Sorting Algorithm
		for (int i = 0; i < data.length-1; i++) 
		{
			
			for (int j = 0; j < data.length-1; j++) 
			{
				if(data[j]<data[j+1])
				{
					continue;
				}
				else
				{
					temp=data[j+1];
					data[j+1]=data[j];
					data[j]=temp;
				}
			}
		}
		
		// Printing Sorted Array
		System.out.print("Sorted Array is:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
	}

}
