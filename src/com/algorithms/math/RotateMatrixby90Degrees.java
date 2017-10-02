package com.algorithms.string;

public class RotateMatrixby90Degrees {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[2][0] = 9;
		arr[2][1] = 0;
		arr[2][2] = 1;
		arr[2][3] = 2;
		arr[3][0] = 3;
		arr[3][1] = 4;
		arr[3][2] = 5;
		arr[3][3] = 6;
		// in-place
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n-i-1; j++) {
				int offset = j-i;
				int top = arr[i][j];
				arr[i][j] = arr[n-i-1-offset][i];  
				arr[n-i-1-offset][i] = arr[n-i-1][n-i-1-offset];
				arr[n-i-1][n-i-1-offset] = arr[j][n-i-1];
				arr[j][n-i-1] = top;		
			}
		}
		
		for(int i =0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
