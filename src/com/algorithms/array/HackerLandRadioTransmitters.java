package com.algorithms.array;

import java.util.Arrays;
import java.util.Scanner;

public class HackerLandRadioTransmitters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int i = 0;
		int transmittersCnt = 0;
		while(i < n){
			transmittersCnt++;
			int cover = arr[i]+k;
			while(i<n && arr[i]<=cover){
				i++;
			}
			i--;
			cover = arr[i]+k;
			while(i<n && arr[i]<=cover){
				i++;
			}
		}
		System.out.println(transmittersCnt);
		
	}

}
