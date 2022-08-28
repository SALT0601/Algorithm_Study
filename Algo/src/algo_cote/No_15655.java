package algo_cote;

import java.io.*;
import java.util.*;


public class No_15655 {

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
    	recur3(0,0);
    	System.out.println(sb);
    }

	private static void recur3(int cur, int start) {
		if(cur==m) {
			for(int i=0;i<m;i++) {
				sb.append(arrOut[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start; i<n;i++) {
			arrOut[cur] = arrIn[i];
			recur3(cur+1, i+1);
		}
	}
}