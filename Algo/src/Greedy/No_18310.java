package Greedy;

import java.util.*;


import java.io.*;

public class No_18310 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i< n; i++) {
				arr[i] = Integer.parseInt(st.nextToken()); 
		
		}
	   	Arrays.sort(arr);
	   	int num = (n-1)/2;
	   	System.out.println(arr[num]);
	}

}
