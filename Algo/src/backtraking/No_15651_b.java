package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_15651_b {
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	static int arr[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];//자리수
		recur(0);
		System.out.println(sb);
	}

	private static void recur(int cur) {//중복 가능
		if(cur==m) {
			for(int i=0; i<m;i++) {
				sb.append(arr[i] +" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n;i++) {
			arr[cur] = i;
			recur(cur+1);//재귀
		
		}
	}
	
	

}
