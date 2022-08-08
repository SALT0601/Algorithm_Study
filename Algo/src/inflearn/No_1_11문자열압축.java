package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class No_1_11문자열압축 {
	public static String solution(String str) {	
			
			//내코드- 투포인터 이용
			String ans="";
			int s=0, e=0, cnt=0;
			str = str + "00";
			char[] chArr = str.toCharArray();
			
			while(e<str.length()) {
				if(chArr[s] == chArr[e]) {
					cnt++;
					e++;
				}else {
					ans += chArr[s];
					ans += cnt;
					s = s+cnt;		
					cnt =0;
				}
			}
			ans = ans.replace("1", "");		
			return ans;
	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String str = br.readLine();
		System.out.println(solution(str));

	
		
	}

}
