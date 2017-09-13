package com.algorithms.string;


/**
 * Linear time Manacher's algorithm to find longest palindromic substring.
 * There are 4 cases to handle
 * Case 1 : Right side palindrome is totally contained under current palindrome. In this case do not consider this as center.
 * Case 2 : Current palindrome is proper suffix of input. Terminate the loop in this case. No better palindrom will be found on right.
 * Case 3 : Right side palindrome is proper suffix and its corresponding left side palindrome is proper prefix of current palindrome. Make largest such point as
 * next center.
 * Case 4 : Right side palindrome is proper suffix but its left corresponding palindrome is be beyond current palindrome. Do not consider this
 * as center because it will not extend at all.
 *
 * To handle even size palindromes replace input string with one containing $ between every input character and in start and end.
 */

/**
 * 1. Expand
 * 2. Check if palindrome touches the end of input to break out of loop
 * 3. Assign values to symmetric elements and form new center
 * 4. Assign start and end
 * 
 */

//Worst case time complexity :O(n)
public class LongestPalindromicSubstring_ManachersAlgorithm {

	public static void main(String[] args) {
//		String str = "abc";
//		String str = "babcbaabcbaccba";
		String str ="cdbabcbabdab";
//		 String str = "abb";

		// handle palindromic strings of even length
		String modifiedStr = "#";
		int index = 0;
		while(index<str.length()){
			modifiedStr += str.charAt(index)+"#";
			index++;
		}

		int[] palindromeLength = new int[modifiedStr.length()];
		int begin = 0;
		int end = 0;
		// i holds the center value
		for (int i = 0; i < modifiedStr.length();) {
			//expand around center
			while (begin > 0 && end < modifiedStr.length()-1
					&& modifiedStr.charAt(begin-1) == modifiedStr.charAt(end+1)) {
				begin--;
				end++;
			}
			palindromeLength[i] = end - begin + 1;
			if (end == modifiedStr.length()-1) {
				break;
			}

			int newCenter = end + 1;
			for (int j = i + 1; j <= end; j++) {
				//palindromeLength[i-(j-i)] holds symmetric elements
				palindromeLength[j] = Math.min(palindromeLength[i-(j-i)], 2*(end-j) + 1);
				
				if(j+palindromeLength[i-(j-i)]/2 == end){
					newCenter = j;
					break;
				}
			}
			
			i = newCenter;
			begin = i - palindromeLength[i]/2;
			end = i + palindromeLength[i]/2; 
		}
		
		int max = Integer.MIN_VALUE;
		index = 0;
		for(int i =0; i<palindromeLength.length; i++){
			if(palindromeLength[i] > max){
				max = palindromeLength[i];
				index = i;				
			}
		}
		String result = modifiedStr.substring(index-max/2,index+max/2+1);
		result = result.replaceAll("#", "");
		System.out.println(result);
	}

}
