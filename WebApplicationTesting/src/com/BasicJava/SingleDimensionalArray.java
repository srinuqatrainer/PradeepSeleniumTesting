package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		/*int a=10;
		a=20;
		
		System.out.println(a);*/
		
		//dataType arrayName[] = new dataType[size];
		
		// dataType []arrayName = new dataType[size];
		
		// Size of an array is fixed
		// if an index of an Array is not save with a Value then Memory wastage
		// Once a size of an array is created then we cannot save even one extra value in the array
		// Array can be save with only similar dataType Values
		
		int pradeep[] = new int[3];
		
		pradeep[0] = 10;
		pradeep[1] = 20;
		pradeep[2] = 30;
		
		/*System.out.println(pradeep[0]);
		System.out.println(pradeep[1]);
		System.out.println(pradeep[2]);*/
		
		/*for(int k=0;k<3;k++)
		{
			System.out.println(pradeep[k]);
		}*/
		
		for(int k=0;k<pradeep.length;k++)
		{
			System.out.println(pradeep[k]);
		}
		
		
		

	}

}
