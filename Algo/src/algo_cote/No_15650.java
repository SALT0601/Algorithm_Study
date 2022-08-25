package algo_cote;

import java.io.*;
import java.util.*;

public class No_15650 {

    static int n;
    static int m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	arr= new int[m+1];
    	recur3(1,1);
    }

	private static void recur3(int cur, int start) {
		if(cur==m+1) {
			for(int i=1; i<m+1;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i = start; i<n+1;i++) {
			arr[cur]=i;
			recur3(cur + 1, i + 1);
		}
	}
}