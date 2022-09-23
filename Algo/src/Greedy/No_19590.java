package Greedy;

import java.util.*;


import java.io.*;

public class No_19590 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		long sum=0;
		for(int i=0; i< n; i++) {
		arr[i] = Integer.parseInt(br.readLine()); 
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		if(arr[n-1]>sum-arr[n-1]) {//제일 큰 수 > 나머지 합 ⇒ 큰 수 - 나머지 합
			System.out.println(arr[n-1]-(sum-arr[n-1]));
		}else if(arr[n-1]==sum-arr[n-1]) {//제일 큰 수 == 나머지 합 ⇒ 0
			System.out.println(0);
		}else {//제일 큰 수 < 나머지 합 ⇒ 전체합 % 2
			System.out.println(sum%2);
		}
	}

}
