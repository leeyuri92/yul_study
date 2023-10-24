package com.Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("나신입", 85);
		map.put("나초보", 75);
		map.put("나일등", 65);
		Object names[] = null;
		
		Set<String> set = map.keySet();         // Key만 가져와서 
		names = set.toArray();                  // names에 배열로 전환  (toArray => set 객체를 배열로 전환)
		System.out.println(names.length);       // 3
		
		for(int i = 0; i<names.length;i++) {
			String key = (String)names[i]; 
			System.out.println(key);		    // 나신입  나일등  나초보  	
		}
	}

}
