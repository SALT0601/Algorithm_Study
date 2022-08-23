package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class No_2_1큰수출력하기 {
	public static String solution(int n, int[] arr) {	
			
			//내코드 
			int s=1, e=2;
			String ans = arr[0]+" ";
			while(e<arr.length-1) {	
				if(arr[s]<arr[e]) {
					ans += arr[e] + " ";
					s++;
					e++;
				}else {
					s++;
					e++;
				}
			}	
			return ans;

	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[num+1];
		for(int i =0; i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		arr[num] = 0; //패딩주기
		System.out.println(solution(num, arr));
		
	}

}
