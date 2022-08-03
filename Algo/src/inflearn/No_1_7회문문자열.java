package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_7회문문자열 {//펠린드롬
	public static String solution(String str) {	
		 //내코드(완탐)
			String ans ="";
			String d="";
			str = str.toUpperCase();
			for(int i=str.length()-1; i>=0;i--) {
				ans += str.charAt(i);	
			}
	
			if(str.equals(ans)) {
				d = "YES";
			}else {
				d="NO";
			}
			return d;
			//해설코드 - 전체 길이 / 2까지만 돌면서 끝과 끝 비교식으로 반복(투포인트)
			//String ans = "YES";
			//str = str.toUpperCase();
			//int len = str.length();
			//for(int i=0; i<len/2;i++) {
			//	if(str.charAt(i) != str.charAt(len-i-1)) return "NO";	//다르면 더 비교하지 말고 바로 No 리턴
			//}
			// return ans;
			
			//스트링 빌더 이용 해설코드 
			//String ans = "NO";
			// String tmp = new StringBuilder(str).reverse().toString();
			//if(str.equalsIgnoreCase(tmp)) ans ="YES"; -> 대소문자는 무시
			// return ans;
		}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(solution(str));
		
	}

}
