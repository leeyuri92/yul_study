package com.Tokenizer;

import java.util.Scanner;
import java.util.*;

public class Scan1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] msg = null;
		
		while(true) {
			String prompt = ">>";
			System.out.println(prompt);
			
			String input = sc.nextLine();
			input.trim();                             // 입력받은 값에서 불필요한 공백 제거
			msg = input.split(" +");             // 입력받은 내용을 공백으로 구분
			
			String command = msg[0].trim();
			
			if("".equals(command)) continue;
			
			command = command.toLowerCase();
			
			if(command.equals("q")) {
				System.exit(0);
			} else {
				for(int i = 0; i<msg.length;i++) {
					System.out.println(msg[i]);
				}
			}
			
			
		}

	}

}