package algo_cote;

import java.io.*;
import java.util.*;


public class No_10819 {

    static int n;
    static int[] arrIn;
    static int[] arrOut= new int[10000];
    static boolean[] visited;
    static int num =0;
    static ArrayList<Integer> ans = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	n = Integer.parseInt(br.readLine());
    	arrIn = new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n;i++) {
    		arrIn[i] = Integer.parseInt(st.nextToken());
   	}
 
    	visited = new boolean[n];
    	recur2(0,visited);
    	Collections.sort(ans);
    	System.out.println(ans.get(ans.size()-1));
    }

	private static void recur2(int cur, boolean[] visited) {
		
		if(cur==n) {
			for(int i=2; i<n+1;i++) {
				num += Math.abs(arrOut[i-2]-arrOut[i-1]);
			}
			ans.add(num);
			num=0;
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