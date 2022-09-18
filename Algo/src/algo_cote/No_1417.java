package algo_cote;

import java.io.*;
import java.util.*;




public class No_1417 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int da = Integer.parseInt(br.readLine());
		int arr[] = new int[n-1];
		int max, cnt=0;
		
		for(int i=0; i<n-1;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		if(n==1) System.out.println(0);
		else {
		while(da<=arr[n-2]) {			
				da++;
				arr[n-2]--;
				cnt++;
				Arrays.sort(arr);
		
		}
		System.out.println(cnt);
		}
		
	
	}

}
