package algo_cote;

import java.io.*;
import java.util.*;


public class No_15654 {

    static int n;
    static int m;
    static int[] arrIn;
    static int[] arrOut= new int[10000];
    static boolean[] visited;
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
    	
    	visited = new boolean[n];
    	recur2(0,visited);
    	System.out.println(sb);
    }

	private static void recur2(int cur, boolean[] visited) {
		if(cur==m) {
			for(int i=0; i<m;i++) {
				sb.append(arrOut[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0; i<n;i++) {
			if(visited[i]) {
    			continue;
    		}
	
			arrOut[cur]=arrIn[i];
			visited[i] = true;
			recur2(cur+1, visited);
			visited[i]=false;
			
		}
	}
}