package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class No_1467 {
	 public static void main(String[] args) throws Exception{
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			 StringTokenizer st = new StringTokenizer(br.readLine());
			long [] arr = new long[n];
			for(int i =0; i<n;i++) {
				arr[i]= Long.parseLong(st.nextToken());
			}
			
			int	e=n-1, s=0;
			long total = Long.MAX_VALUE;
		   int ansS = 0, ansE = n-1;
			while(s<e) {
			    long sum = Math.abs(arr[e]+arr[s]);
				if(sum <total ) {
					total = sum;
					 ansS = s;
		             ansE = e;
				}
				
				if (sum == 0)
	                break;

	            if (arr[e]+arr[s] > 0) e--;
	            else s++;
			}
			
			  System.out.println(arr[ansS] + " " + arr[ansE]);
		}
}
