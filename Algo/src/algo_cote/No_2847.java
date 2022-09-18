package algo_cote;

import java.io.*;
import java.util.*;




public class No_2847 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int res=0, max=0;
		for(int i=0; i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n;i++) {
			res = arr[i]*(n-i);
			max = Math.max(max,res);
		}
		System.out.println(max);
	}

}
