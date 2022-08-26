package algo_cote;

import java.io.*;
import java.util.*;

public class No_15651 {

    static int n;
    static int m;
    static int[] arr=new int[110];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	recur1(0);
    	System.out.println(sb);
    }

	private static void recur1(int cur) {
		if(cur==m) {
			for(int i=0; i<m;i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=1; i<n+1;i++) {
			arr[cur]=i;
			recur1(cur+1);
		
		}
	}
}