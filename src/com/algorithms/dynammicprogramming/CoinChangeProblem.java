package com.algorithms.dynammicprogramming;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/coin-change
public class CoinChangeProblem {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int totalVal = in.nextInt();
		int noOfCoins = in.nextInt();
		int[] coins = new int[noOfCoins];
		long[] combination = new long[totalVal + 1];
		combination[0] = 1;
		for (int i = 0; i < noOfCoins; i++) {
			coins[i] = in.nextInt();
		}
		for (int i = 0; i < noOfCoins; i++) {
			for(int j=1;j<=totalVal;j++){
				if(j>=coins[i]){
					combination[j] += combination[j-coins[i]]; 
					// existing value is added with the (current value subtracted from the current denomination)
				}
			}
		}
		System.out.println(combination[totalVal]);
	}

}
