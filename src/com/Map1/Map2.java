package com.Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(new Integer(1), "85");    // autoboxsing 원시형 int Integer
		map.put(2, "75");
		map.put(3, "65");
		Object names[] = null;
		
		Set<Integer> set = map.keySet();
		names = set.toArray();
		
		Object[] its = map.keySet().toArray();           // 한 문장으로 표현
		
		// 3가지 방법
		for(Object obj:its) {
			System.out.println(obj);
		}
		for(Object obj:names) {
			System.out.println(obj);			
		}
		for(int i = 0; i<names.length;i++) {
			Integer key = (Integer)names[i];
			System.out.println(key);			
		}

	}

}
