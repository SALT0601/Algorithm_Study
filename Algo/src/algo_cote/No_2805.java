package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_2805 {
	static int[] arr;
	static int m, n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		 m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		 st = new StringTokenizer(br.readLine());
		for(int i =0; i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int s=0, e=1000000000, res=0;
		while(s<=e) {
			int mid = (s+e)/2;
			if(check(mid)) {
				 res = mid;
				s = mid +1;
			}else {
				e=mid-1;
			}
		}
		System.out.println(res);
	}
	
	 static boolean check(int x) {
		int total =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>x) {
				total += arr[i] -x;
			
			}
			
		}
		return total >= m;
	}
}
