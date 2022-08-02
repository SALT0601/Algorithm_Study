package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_1문자찾기 {
	public static int solution(String str, char t) {
		int ans=0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==t) {
				ans++;
			}
		}
		//향상된 for문 
		//for(char x : str.toCharArray()) //toCharArray()가 문자열의 char로 분리해 문자배열을 새로 생성
		//{
		//	if(x==t) ans++;
		//}
		return ans;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = br.readLine().charAt(0);
		System.out.println(solution(str, c));
		

	}

}
