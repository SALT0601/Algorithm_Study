package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No_1_9숫자만추출 {
	public static int solution(String str) {	
		//내 코드 - 2번과 유사
			 str=str.replaceAll("[^0-9]","");		
		  int num = Integer.parseInt(str);
			 return num;
			 //해설 코드 - 아스키 넘버 이용
			 //int ans = 0;
			 //for(char x : str.toCharArray()) {
			//	if(x>=48 && x<==57) ans = ans*10 + (x-48);
			 //}
			 //return ans;
			 
			 //해설 코드2 - 숫자로 만들어 리턴
			 //int ans=0;
			 //for(char x : str.toCharArray()) {
				//	if(Character.isDigit(x)) ans += x;//isDigit -> 숫자냐 판단
				 //}
			//return ans;
			 
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();	
		System.out.println(solution(str));
		
	}

}
