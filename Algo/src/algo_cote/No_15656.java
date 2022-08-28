package algo_cote;

import java.io.*;
import java.util.*;


public class No_15656 {

    static int n;
    static int m;
    static int[] arrIn;
    static int[] arrOut= new int[10000];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	arrIn = new int[n];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n;i++) {
    		arrIn[i] = Integer.parseInt(st.nextToken());

    	}
 
    	Arrays.sort(arrIn); 
    	recur1(0);
    	System.out.println(sb);
    }

	private static void recur1(int cur) {
		if(cur==m) {
			for(int i=0; i<m; i++) {
				sb.append(arrOut[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n;i++) {
			arrOut[cur]=arrIn[i];
			recur1(cur+1);
		}
	
	}
}