package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class No_1816 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 long arr[] = new long[n];
 		 for(int i=0; i<n;i++) {
			arr[i] = Long.parseLong(br.readLine());
			 
		 }
 		 
 		 for(int i=0; i<n;i++) {
 			int cnt=0;
			 for(long j=2; j<1000000;j++) {
				 if(arr[i]%j==0) cnt++;
			 }
			 if(cnt==0) System.out.println("YES");
			 else System.out.println("NO");
 		 }
	
	}

}
