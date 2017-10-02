package com.algorithms.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strArr = {"cat", "dog", "tac", "god", "act"};
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		Map<String,List<String>> map = new HashMap<>();
		for(String str: strArr){
			List<Integer> intList = new ArrayList<Integer>();
			
			for(int i=0;i<str.length();i++){
				int k = alphabets.indexOf(str.charAt(i));
				intList.add(k);
			}
			Collections.sort(intList);
			String x = "";
			for(Integer val : intList){
				x += alphabets.charAt(val);
			}
			if(map.containsKey(x)){
				map.get(x).add(str);
			}else{
				List list = new ArrayList<String>();
				list.add(str);
				map.put(x,list);
			}
		}
		for(Map.Entry<String, List<String>> res : map.entrySet()){
			System.out.println(res.getValue());
		}

	}

}
