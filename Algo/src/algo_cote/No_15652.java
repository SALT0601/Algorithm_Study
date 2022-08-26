package algo_cote;

import java.io.*;
import java.util.*;

public class No_15652 {

    static int n;
    static int m;
    static int[] arr=new int[110];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	recur3(0,1);
    	System.out.println(sb);
    }

	private static void recur3(int cur, int start) {
		if(cur==m) {
			for(int i=0; i<m;i++) {
				sb.append(arr[i] +" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start; i<n+1;i++) {
			arr[cur] =i;
			recur3(cur+1, i);
		}
	}
}