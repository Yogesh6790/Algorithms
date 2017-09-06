package com.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/queens-attack-2
public class QueensAttack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int rQueen = in.nextInt();
		int cQueen = in.nextInt();
		int c_R_obstacle = -1;
		int c_L_obstacle = -1;
		int r_T_obstacle = -1;
		int r_B_obstacle = -1;
		int r_BL_obstacle = -1;
		int c_BL_obstacle = -1;
		int r_BR_obstacle = -1;
		int c_BR_obstacle = -1;	
		int r_TL_obstacle = -1;
		int c_TL_obstacle = -1;
		int r_TR_obstacle = -1;
		int c_TR_obstacle = -1;	
		for (int a0 = 0; a0 < k; a0++) {
			int r_obstacle = in.nextInt();
			int c_obstacle = in.nextInt();
			//right
			if((c_obstacle < c_R_obstacle || c_R_obstacle == -1) && c_obstacle > cQueen && r_obstacle == rQueen){
				c_R_obstacle = c_obstacle;
			}
			//bottomright
			if (((r_obstacle > r_BR_obstacle && c_obstacle < c_BR_obstacle) || r_BR_obstacle == -1) && r_obstacle < rQueen && c_obstacle > cQueen
					&& (rQueen - r_obstacle  == c_obstacle - cQueen)) {
				r_BR_obstacle = r_obstacle;
				c_BR_obstacle = c_obstacle;
			}
			//bottom
			if((r_obstacle > r_B_obstacle || r_B_obstacle == -1) && r_obstacle < rQueen && c_obstacle == cQueen){
				r_B_obstacle = r_obstacle;
			}
			//bottomleft
			if (((r_obstacle > r_BL_obstacle && c_obstacle > c_BL_obstacle) || r_BL_obstacle == -1) && r_obstacle < rQueen && c_obstacle < cQueen
					&& (rQueen - r_obstacle  == cQueen - c_obstacle)) {
				r_BL_obstacle = r_obstacle;
				c_BL_obstacle = c_obstacle;
			}
			//left
			if((c_obstacle > c_L_obstacle || c_L_obstacle == -1) && c_obstacle < cQueen && r_obstacle == rQueen){
				c_L_obstacle = c_obstacle;
			}
			//topleft
			if (((r_obstacle < r_TL_obstacle && c_obstacle > c_TL_obstacle) || r_TL_obstacle == -1) && r_obstacle > rQueen && c_obstacle < cQueen
					&& (r_obstacle - rQueen == cQueen - c_obstacle)) {
				r_TL_obstacle = r_obstacle;
				c_TL_obstacle = c_obstacle;
			}
			//top
			if((r_obstacle < r_T_obstacle || r_T_obstacle == -1) && r_obstacle > rQueen && c_obstacle == cQueen){
				r_T_obstacle = r_obstacle;
			}
			//topright
			if (((r_obstacle < r_TR_obstacle && c_obstacle < c_TR_obstacle) || r_TR_obstacle == -1) && r_obstacle > rQueen && c_obstacle > cQueen
					&& (r_obstacle - rQueen == c_obstacle - cQueen)) {
				r_TR_obstacle = r_obstacle;
				c_TR_obstacle = c_obstacle;
			}
	
			
		}
		int totalLength = 0;
		
		//T B L R
		totalLength += r_T_obstacle > -1 ? r_T_obstacle - rQueen - 1 : n - rQueen;
		totalLength += r_B_obstacle > -1 ? rQueen - r_B_obstacle - 1 : rQueen - 1;
		totalLength += c_L_obstacle > -1 ? cQueen - c_L_obstacle - 1 : cQueen - 1;
		totalLength += c_R_obstacle > -1 ? c_R_obstacle - cQueen - 1: n - cQueen;
		//TL TR BL BR
		totalLength += r_TL_obstacle > -1 ? r_TL_obstacle - rQueen - 1 : Math.min(n - rQueen, cQueen - 1);
		totalLength += r_TR_obstacle > -1 ? r_TR_obstacle - rQueen - 1 : Math.min(n - rQueen, n - cQueen);
		totalLength += r_BL_obstacle > -1 ? rQueen - r_BL_obstacle - 1 : Math.min(rQueen - 1,cQueen-1);
		totalLength += r_BR_obstacle > -1 ? rQueen - r_BR_obstacle - 1 : Math.min(n - cQueen, rQueen - 1);		
		
		System.out.println(totalLength);
		
	}

}
