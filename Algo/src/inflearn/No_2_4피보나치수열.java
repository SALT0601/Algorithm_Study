package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class No_2_4피보나치수열 {
	public static String solution(int n) {	
			
			//내코드 -> 해설코드와 일치
		int arr[] = new int[n];
	
		arr[0]=1;
		arr[1]=1;
		String ans ="1 1 ";
		for(int i=0; i<n-2;i++) {
			arr[i+2] = arr[i] + arr[i+1] ;
			ans += arr[i+2] + " ";
		}
			return ans;	
			//해설코드2 - 배열없이 돌리기
			//int a=1, b=1, c;
			//System.out.println(a+ " " + b + " ");
			//for(int i=2; i<n;i++) {
			//	c=a+b;
			//	System.out.println(c+ " ");
			//	a=b;
			//	b=c;
			//}

	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		int n = Integer.parseInt(br.readLine());
	
		System.out.println(solution(n));

	}

}
