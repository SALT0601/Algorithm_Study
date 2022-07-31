package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_10816 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 static int n,m;
	 static int[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		 arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		 m = Integer.parseInt(br.readLine());
		 st = new StringTokenizer(br.readLine());
		 
		 StringBuilder sb = new StringBuilder();
		for(int j=0; j<m;j++) {
			int num = Integer.parseInt(st.nextToken());
			 sb.append(upper(arr,num) - lower(arr, num)).append(' ');
		}
		System.out.println(sb);
	}
	
	private static int lower(int[]arr, int num) {
		int s=0, e= n-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid]>=num) {
			
				e = mid-1;
			}else {
				s = mid +1;
			}
		}
		return s;
	}
	private static int upper(int[] arr, int num){

		int s=0;
		int e=n-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid]>num) {
			
				e = mid-1;
			}else {
				s = mid +1;
			}
		}
	
	
		return s;
	}
	
}
