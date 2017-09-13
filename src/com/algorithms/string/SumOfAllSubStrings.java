package com.algorithms.string;

import java.util.Scanner;

// Worst case time complexity : O(n)
public class SumOfAllSubStrings {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long counter = 0;
        long mod = (long)(Math.pow(10, 9)+7);
        long f = 1;
        for(int i=s.length()-1;i>=0;i--){
        	int k = i+1;
        	int x = s.charAt(i)-'0';
        	counter = (counter+(x*f*k))%mod;
        	f = (f*10+1)%mod; 
        	//number*position*11...1(10's place)
        }
        System.out.println(counter);
     }
}
