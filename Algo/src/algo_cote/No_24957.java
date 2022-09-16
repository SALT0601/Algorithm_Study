package algo_cote;

import java.io.*;
import java.util.*;


public class No_24957 {

    static int n,p, num;
   
    static int[] arrIn;
    static TreeMap<Integer,String> dis = new TreeMap <>();
    static int[] arrOut = new int[1000];
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	n = Integer.parseInt(br.readLine());

    	arrIn = new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n;i++) {
    		arrIn[i] = Integer.parseInt(st.nextToken());
    		
    	}
    	num=0;
    	for(int i=0; i<n; i++) {
    		
    		p = Integer.parseInt(br.readLine());
    		if(p==0) continue;
    		for(int j=num; j<p+num;j++) {	
    			dis.put(j, br.readLine());
    		}
    		num=num+p;
    		System.out.print(dis.get(i)+" ");
    	}
    	System.out.print(dis.get(1)+" ");
    	visited = new boolean[n];
    	recur2(0,visited);
    	System.out.println(sb);
    }

	private static void recur2(int cur, boolean[] visited) {
		if(cur==n) {
			for(int i=0; i<n;i++) {
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