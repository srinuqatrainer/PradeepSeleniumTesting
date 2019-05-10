package com.BasicJava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		// dataType arrayName[][] = new dataType[size][size];
		
		String pradeep[][] = new String[2][3];
		
		pradeep[0][0] = "Testing";
		pradeep[0][1] = "Selenium";
		pradeep[0][2] = "Functional";
		
		pradeep[1][0] = "DataBase";
		pradeep[1][1] = "Oracle";
		pradeep[1][2] = "45454";
		
		int x=pradeep.length;
		System.out.println(x);
		
		int y=pradeep.length;
		System.out.println(y);
		
		
		for(int i=0;i<pradeep.length;i++) // to goto every Row
		{
			for(int k=0;k<3;k++)
			{
				System.out.println(pradeep[i][k]);
			}
		}

	}

}
