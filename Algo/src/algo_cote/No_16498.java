package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_16498 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int minG = Integer.MAX_VALUE;
		int num =0;
		int[] arr = new int[a];
		int[] brr = new int[b];
		int[] crr = new int[c];
		 st = new StringTokenizer(br.readLine());
		for(int i =0; i<arr.length;i++) {
			arr[i] =  Integer.parseInt(st.nextToken());
		}
		 st = new StringTokenizer(br.readLine());
			for(int i =0; i<brr.length;i++) {
				brr[i] =  Integer.parseInt(st.nextToken());
			}
			 st = new StringTokenizer(br.readLine());
				for(int i =0; i<crr.length;i++) {
					crr[i] =  Integer.parseInt(st.nextToken());
				}
		
				for(int g =0; g<arr.length;g++) {
					for(int j =0; j<brr.length;j++) {
						for(int k =0; k<crr.length;k++) {
							num = Math.max(arr[g],Math.max(brr[j], crr[k])) - Math.min(arr[g],Math.min(brr[j], crr[k]));
							if(num<minG) {
								minG=num;
							}
						}
					}
				}
				System.out.println(minG);
	}
}
