package Greedy;

import java.util.*;


import java.io.*;

public class No_14400 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		int xa = 0;
		int ya = 0;
		
		int[][] people = new int[N][2];
		for(int z=0;z<N;z++) {
			st = new StringTokenizer(br.readLine());
			people[z][0] =  Integer.parseInt(st.nextToken());
			people[z][1]=  Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		xa = people[N/2][0];
		
		Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		ya = people[N/2][1];
		
		long sum = 0;
		for(int[] person : people) {
			sum += Math.abs(xa-person[0]) + Math.abs(ya-person[1]);
		}
		
		System.out.println(sum);
	}

}
