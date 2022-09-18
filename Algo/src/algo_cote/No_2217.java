package algo_cote;

import java.io.*;
import java.util.*;




public class No_2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int res=0;
		for(int i=0; i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i = n - 2; i >= 0; i--) {
			
			if(arr[i] >=arr[i+1]) {
				res += arr[i] - arr[i+1]+1;
				arr[i] = arr[i+1]-1;
			}
		}
		System.out.println(res);
	}

}
