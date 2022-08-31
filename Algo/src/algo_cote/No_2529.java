package algo_cote;

import java.io.*;
import java.util.*;


public class No_2529 {

    static int n;
    static char[] sign;
    static boolean[] visited;
    static int[] arrOut;
    static List<String> result = new ArrayList<>();
  
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	n = Integer.parseInt(br.readLine());
    	sign = new char[n];
    	arrOut = new int[n+1];
    	visited = new boolean[10];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n;i++) {
    		sign[i] = st.nextToken().charAt(0);
    		System.out.println(sign[i]);

    	}
    	recur2(0, visited);
    	Collections.sort(result);//작은거부터 큰순으로 나열
    	 StringBuilder sb = new StringBuilder();
    	 sb.append(result.get(result.size()-1));
    	 sb.append("\n");
    	 sb.append(result.get(0));
    	System.out.print(sb);//최대값
    	
    }

	private static void recur2(int cur, boolean[] visited) {
		//부등호가 반대면 넘어감
		
		if(cur>=2) {
			if(sign[cur-2] == '>' && arrOut[cur-2] < arrOut[cur-1]) return;
			if(sign[cur-2] == '<' && arrOut[cur-2] > arrOut[cur-1]) return;
		}
		if(cur==n+1) {
			//result에 한번에 넣어주기
			StringBuilder tmp = new StringBuilder();
			for(int i=0;i<n+1;i++) {
				tmp.append(arrOut[i]);
				
			}
			result.add(tmp.toString());
            return;
		
		}
		
		for(int i=0; i<10;i++) {
			if(visited[i]==true) continue;			
			arrOut[cur]=i;
			visited[i] = true;
			recur2(cur+1, visited);
			visited[i] = false;
			
		}
	
	}
}