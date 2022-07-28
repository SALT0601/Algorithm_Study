package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N0_10815 {
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
		for(int j=0; j<m;j++) {
			int num = Integer.parseInt(st.nextToken());
			if(check(num)) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
	}
	
	private static boolean check(int num) {
		int s=0, e= n-1;
		int mid;
		while(s<=e) {
			mid = (s+e)/2;
			if(arr[mid]==num) {
				return true;
			}else if(arr[mid]<num) {
				s = mid +1;
			}else {
				e = mid -1;
			}
		}
		return false;
	}

}
