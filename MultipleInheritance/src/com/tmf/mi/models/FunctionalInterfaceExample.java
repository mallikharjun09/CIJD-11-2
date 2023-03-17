package com.tmf.mi.models;

import java.util.stream.IntStream;

public class FunctionalInterfaceExample {
	char[] ch2 = new char[100];
	public FunctionalInterfaceExample() {
		String str = "welcome";
		char[] ch = str.toCharArray();
		int idx = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'i') {
				ch2[i] = ch[i];
				//idx++;
			}
		}
		for(int i=0;i<ch2.length;i++) {
			System.out.println(ch2[i]);
		}
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample ex = new FunctionalInterfaceExample();
		
	}
}
