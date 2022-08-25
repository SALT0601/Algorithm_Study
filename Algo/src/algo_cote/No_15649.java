package algo_cote;

import java.io.*;
import java.util.*;

public class No_15649 {

    static int n;
    static int m;
    static int[] arr = new int[1000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[n+1];
        recur2(0, visited);

    }
    
    public static void recur2(int cur, boolean[] visited) {
    	if(cur == m) {
    		for(int i=0;i<m;i++) {
    			System.out.print(arr[i] + " ");
    		}
    		System.out.println();
    		return;
    	}
    	for(int i=1; i<n+1;i++) { 		
    		if(visited[i]) {
    			continue;
    		}
    		arr[cur] = i;
    		visited[i] = true;
    		recur2(cur+1, visited);
    		visited[i] = false;
    	}
    }
}