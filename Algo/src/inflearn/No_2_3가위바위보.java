package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class No_2_3가위바위보 {
	public static String solution(int n, int arrA, int arrB) {	
			
			//내코드 - 하드코딩...
		String ans ="";
		if(arrA<arrB) {
			if(arrB-arrA==2) ans = "A";
			else ans ="B";
		}else if(arrA>arrB){
			if(arrA-arrB==2) ans = "B";
			else ans ="A";
		}else {
			ans = "D";
		}
			return ans;
			
			//해설코드 - 더 하드코딩...
			//for(int i=0; i<n;i++) {
			//	if(a[i]==b[i]) ans +="D";
			//	else if(a[i]==1 && b [i]==3) ans += "A";
			//	else if(a[i]==2 && b [i]==1) ans += "A";
			//	else if(a[i]==3 && b [i]==2) ans += "A";
			//	else ans +="B";
			//}
			
			

	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arrA[] = new int[n];
		int arrB[] = new int[n];
		for(int i =0; i<n;i++) {
			arrA[i]=Integer.parseInt(st.nextToken());
		}
		 st = new StringTokenizer(br.readLine());
		for(int i =0; i<n;i++) {
			arrB[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<n;i++) {
			System.out.println(solution(n, arrA[i], arrB[i]));
		}
		

	}

}
