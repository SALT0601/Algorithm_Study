package algo_cote;


import java.io.*;
import java.util.*;

public class No_14465 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken());
		int k= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		
		int[] sum = new int[n+1];
		boolean[] isBroken = new boolean[n + 1];
		for(int i = 0; i<b; i++) {
			isBroken[Integer.parseInt(br.readLine())]=true;
		}
		
		int cnt =0;
		for(int i =1; i<=k;i++) {
			if(isBroken[i]) {
				cnt++;
			}
		}
			sum[k] = cnt;
			int result = cnt;
			
			for(int j =k+1 ; j<=n ; j++) {
				int temp = sum[j-1];
				if(isBroken[j]) temp++;
				if(isBroken[j-k])temp--;
				
				sum[j] = temp;
				result = Math.min(result, temp);
			}
			
		
		System.out.println(result);		
	}
			
}
