package sample;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		int x[]= {10,20,30};
		int y[]= new int[5];
		for(int index=0;index<3;index++)
		System.out.println(x[index]);
		Scanner input=new Scanner(System.in);
		String [] names=new String[5];
		
		for(int index=0;index<5;index++) {
			System.out.println("Plese Enter a Name");
			names[index]=input.nextLine();
		}
		names[3]="Thanu";
		for(int i=0;i<5;i++) {
			System.out.println("Name @ "+ i +" = "+ names[i]);
		}
	}
}
