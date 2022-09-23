package Greedy;

import java.util.*;


import java.io.*;

public class No_2138 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans1 = 1, ans2 = 0, INF = 987654321;
		int n = Integer.parseInt(br.readLine());
		
	   String now = br.readLine();
	   String expect = br.readLine();
	   
	   int[] now_arr_1 = new int[n];
		int[] now_arr_2 = new int[n];
		int[] expect_arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			now_arr_1[i] = now.charAt(i)-'0';
			now_arr_2[i] = now.charAt(i)-'0';
			expect_arr[i] = expect.charAt(i)-'0';
		}
		now_arr_1[0] = 1-now_arr_1[0];
		now_arr_1[1] = 1-now_arr_1[1];
				
		for(int i = 1; i < n; i++) {
			if(now_arr_1[i-1] != expect_arr[i-1]) {
				now_arr_1[i-1] = 1 - now_arr_1[i-1];
				now_arr_1[i] = 1 - now_arr_1[i];
				ans1++;
				if(i != n-1)
					now_arr_1[i+1] = 1 - now_arr_1[i+1];						
				
			}
			if(now_arr_2[i-1] != expect_arr[i-1]) {
				now_arr_2[i-1] = 1 - now_arr_2[i-1];
				now_arr_2[i] = 1 - now_arr_2[i];
				ans2++;
				if(i != n-1)
					now_arr_2[i+1] = 1 - now_arr_2[i+1];		
			}
		}

		if(now_arr_1[n-1] != expect_arr[n-1]) ans1 = INF;
		if(now_arr_2[n-1] != expect_arr[n-1]) ans2 = INF;
		
		
		if(ans1 == INF && ans2 == INF)
			System.out.println(-1);
		else
			System.out.println(Math.min(ans1, ans2));
	}
}
