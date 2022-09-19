package Greedy;

import java.util.*;


import java.io.*;

public class No_5054 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i< t; i++) {
			int n= Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n;j++) { 
				arr[j] = Integer.parseInt(st.nextToken()); 
			}
			Arrays.sort(arr);
			System.out.println((arr[n-1] - arr[0])*2);
		}
	}

}
