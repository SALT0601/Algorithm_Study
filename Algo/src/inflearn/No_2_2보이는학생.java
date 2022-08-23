package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class No_2_2보이는학생 {
	public static int solution(int n, int[] arr) {	
			
			//내코드 - for문 이용 -> 해설코드랑 100퍼 일치
		int MIN = arr[0], cnt=1;
		for(int i=1; i<n;i++) {
			if(MIN< arr[i]) {
				MIN = arr[i];
				cnt++;
			}
		}
			return cnt;
			
			

	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i =0; i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		System.out.println(solution(n, arr));

	}

}
