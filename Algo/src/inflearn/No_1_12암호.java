package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class No_1_12암호 {
	public static String solution(int n, String str) {	
			
			//내코드
			int num = n;
			String ans="";
			String res="";
			int arr[] = new int[num];
			int s=0, e=0, cnt=0;
			while(e<str.length()) {
					
				if(str.charAt(e)=='#') {
					ans+="1";
					e++;
					cnt++;
				}else {
					ans+="0";
					e++;
					cnt++;
				}
				if(cnt%7==0) {
					//10진수로 변환
					arr[s]=Integer.parseInt(ans,2);
					s++;
					ans="";									
				}			
			}
			for(int i =0; i<n;i++) {
				res += (char)arr[i];
			}
				
			return res;
			
		
	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(solution(num, str));
		
	}

}
