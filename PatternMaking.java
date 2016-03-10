package com.acadglid.java.core.session2.assignment3;

import java.util.Scanner;

public class PatternMaking {
	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s=new Scanner(System.in);
		System.out.println("Enter the range of pattern");
		int range=(int)s.nextDouble();
		for(int i= 1; i<2*range;i++){
			if(i<=range){
				for(int j=1;j<=i;j++){
					System.out.print(j + " ");
				}
				System.out.println();
			}else{
				for(int j=1;j<=2*range-i;j++){
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}

	}

}
