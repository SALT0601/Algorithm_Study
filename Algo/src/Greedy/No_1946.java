package Greedy;

import java.util.*;


import java.io.*;

public class No_1946 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
	
		StringTokenizer st;
		
		for(int tc = 0; tc < t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][2];
			int cnt = 1; //서류 1위는 항상 뽑힘
	
			for(int i=0; i<n;i++) {		
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());	// 서류순위 
				arr[i][1] = Integer.parseInt(st.nextToken());	// 면접순위 
			}
			// 서류 기준으로 정렬하기 위해 compare 재정의 
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] arr1, int[] arr2) {	// 서류를 기준으로 오름차순 정렬을 시행한다.
					return Integer.compare(arr1[0], arr2[0]);
				}
			});

			int pivot = arr[0][1];	// 첫 번째 지원자의 면접 성적이 기준이 된다.
			for(int i=0; i<n; i++) {
				
				if(arr[i][1] < pivot) {	// 면접 성적이 그 전 선발된 지원자 보다 뛰어날경우 => 선발
					pivot = arr[i][1];	// 다음 합격자를 판별하기 위해 전에 선발된 지원자의 면접 성적 저장
					cnt++;
				}
			}
			System.out.println(cnt);
		}
			
	
	}

}
