package p2024_07_10;

import java.util.Scanner;

public class ParkJongChan5 {

	public static void main(String[] args) {
		
		int[][] dan = new int[8][9];
		
		for(int i=2; i<=9; i++) {
			for(int s=1; s<=9; s++) {
				dan[i-2][s-1]= i*s;
			}
		}
		
		for(int i=0; i<dan.length; i++) {
			for(int s=0; s<dan[i].length; s++) {
				System.out.print(dan[i][s]+"\t");
			}
			System.out.println();
		}
		
	}
}
