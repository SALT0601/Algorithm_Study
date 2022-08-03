package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_6중복문자제거 {
	public static String solution(String str) {	
			String ans ="";
			
			//indexOf 사용 -> 가장 처음 등장하는 위치
			for(int i=0; i<str.length();i++) {
				int num = str.charAt(i);
				if( i==str.indexOf(num)) ans += str.charAt(i);
			}
			return ans;
				
		}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));
		
	}

}
