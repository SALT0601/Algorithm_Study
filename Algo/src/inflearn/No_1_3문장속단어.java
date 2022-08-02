package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_3문장속단어 {
	
	public static String solution(String str) {
	
	 String ans = "";
		//향상된 for문 
		for(char x : str.toCharArray()) //toCharArray()가 문자열의 char로 분리해 문자배열을 새로 생성
		{
			if(Character.isLowerCase(x)) ans += Character.toUpperCase(x);
			//Character.isLowerCase(x)가 소문자인지 확인하는 것
			else ans += Character.toLowerCase(x);
		}
		return ans;
		//아스키로 풀기
		/*
		 *for(char x : str.toCharArray()) //toCharArray()가 문자열의 char로 분리해 문자배열을 새로 생성
		{
			if(x>=65&& x<=90) ans += (char)(x+32);
			//Character.isLowerCase(x)가 소문자인지 확인하는 것
			else ans += (char)(x-32);
		}
		 * */
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.print(solution(str));
		
		

	}

}
