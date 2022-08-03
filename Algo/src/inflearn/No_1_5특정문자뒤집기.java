package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_5특정문자뒤집기 {
	public static String solution(String str) {	
			String ans ="";
			char[] chArr = str.toCharArray();
			int s=0, e=str.length()-1;
			//내코드
			while(s<e){
				if(!(String.valueOf(chArr[s]).matches("[a-zA-Z]"))) {	
					//해설코드
					//!Character.isAlphabetic(chArr[s]) -> 알파벳인지 구별함
					s++;					
				}else if(!(String.valueOf(chArr[e]).matches("[a-zA-Z]"))) {					
					e--;
				}else {
					char tmp =chArr[s];
					chArr[s]=chArr[e];
					chArr[e]=tmp;
					s++;
					e--;
				}			
			ans = String.valueOf(chArr);
			}
			return ans;
				
		}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));
		
	}

}
