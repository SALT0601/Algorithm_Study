package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No_1_8팰린드롬 {
	public static String solution(String str) {	
		String ans = "NO";
		String text = "";
			char [] chArr = str.toCharArray();
			for(int i=0; i<str.length();i++) {
				if(Character.isAlphabetic(chArr[i])) {
					text += chArr[i];
				}
			}
			 String tmp = new StringBuilder(text).reverse().toString();
			if(text.equalsIgnoreCase(tmp)) ans ="YES"; 
			 return ans;
		}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(solution(str));
		
	}

}
