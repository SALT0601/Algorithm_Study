package Greedy;

import java.util.*;


import java.io.*;

public class No_2437 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i< n; i++) {
				arr[i] = Integer.parseInt(st.nextToken()); 
		
		}
	
		  //1 - 1
        //2 - 1 2
        //4 - 3
        //7 - 5 6
        //13 - 8 9 10 11 12
        //20 - 14 15 16 17 18 19
        //50 - 21
		//누적합 + 1이 저울로 구할 수 없는 가장 최소 
	   	Arrays.sort(arr);
		if(arr[0] !=1) System.out.println(1); //1이 아니면 최소는 1이됨
		else {
			int sum=arr[0];
		    for(int i=1; i<n;i++) {
		    	if(sum+1<arr[i]) break;
		    	sum += arr[i];
		    }
		    
		    System.out.println(sum+1);
		}
	}

}
