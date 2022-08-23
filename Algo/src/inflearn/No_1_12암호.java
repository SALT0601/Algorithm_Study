package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class No_1_12암호 {
	public static String solution(int n, String str) {	
			
			//내코드 
			String ans=""; //7개씩 넣을 문자열
			String res=""; // 해석되어 넣어질 문자열
			int arr[] = new int[n];
			int s=0, e=0, cnt=0;
			//s는 arr의 인덱스
			//e는 str 인덱스
			while(e<str.length()) {
				//str의 인덱스 찾아 비교	
				if(str.charAt(e)=='#') {
					ans+="1";
					e++;
					//cnt 개수 늘려줌
					cnt++;
				}else {
					ans+="0";
					e++;
					cnt++;
				}
				//cnt 개수가 7의 배수라면
				if(cnt%7==0) {
					//10진수로 변환 후 배열에 넣어줌
					arr[s]=Integer.parseInt(ans,2);
					//arr배열의 인덱스 증가
					s++;
					//ans는 초기화 하여 다시 7개씩 받게 함
					ans="";									
				}			
			}
			//for 문으로 아스키코드 변환해 res에 넣어줌
			for(int i =0; i<n;i++) {
				res += (char)arr[i];
			}
			
			return res;
			
			//해설 코드 - substring(문자열 자르기) 이용
			//for(int i=0; i<n;i++) {
			//	String tmp = str.substring(0,7).replace('#', '1').replace('*','0');
			//	int num = Integer.parseInt(tmp,2); //tmp를 10진수화
			//	ans += (char) num;
			//	str = str.substring(7); //7부터 끝까지 다시 스트링에 넣음
			
			//}
			//return ans;
			
			
	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(solution(num, str));
		
	}

}
