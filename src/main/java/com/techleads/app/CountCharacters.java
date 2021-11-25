package com.techleads.app;
import java.util.*;
public class CountCharacters {

	public static void main(String[] args) {
		String str="microservices";
		char[] ch=str.toCharArray();
		Map<Character, Integer> map =new LinkedHashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				int count=map.get(ch[i]);
				map.put(ch[i], ++count);
			}else {
				map.put(ch[i], 1);
			}
		}
		
		System.out.println(map);

	}

}
