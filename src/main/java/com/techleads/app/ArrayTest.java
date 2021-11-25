package com.techleads.app;

public class ArrayTest {

	public static void main(String[] args) {
//	//input {
//			{1, 2, 0, 3 },
//			{0, 4, 0, 0 },
//			{5, 6, 7, 0 },
//			{8, 9, 10, 11 }
//			}
		
		//output 1 2 4 6 9 10 11 
		// a[0][0], a[0][1],  a[1][1], a[2][1],a[3][1],a[3][2],
		//1 2 4 7 11
		//a[0][0], a[0][1], a[1][1],a[2][2], a[3][2]
		
		//1 2 4 6 10 11
		int[][] a={
				{1, 2, 0, 3 },
				{0, 4, 0, 0 },
				{5, 6, 7, 0 },
				{8, 9, 10, 11 }
				};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				 
				
//				if(a[i][j]!=0 && a[i][j]!=3) {
//					System.out.print(a[i][j]+" ");
//				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
