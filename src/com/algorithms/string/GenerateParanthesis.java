package com.algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		int n = 3;//specifies the valid parenthesis size
		generateParanthesis(list,"",n,n);
		System.out.println(list);
	}

	private static void generateParanthesis(List<String> list, String string, int left, int right) {
		if(left>right){//more closing braces are used before opening braces
			return;
		}
		if(left ==0 && right ==0){
			list.add(string);
			return;
		}
		if(left>0){
			generateParanthesis(list,string+"(",left-1,right);
		}
		if(right>0){
			generateParanthesis(list,string+")",left,right-1);
		}
		
	}

}
