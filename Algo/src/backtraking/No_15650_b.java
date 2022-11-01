package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_15650_b {
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	static int arr[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];//자리수
		recur(0,1);
		System.out.println(sb);
	}

	private static void recur(int cur, int start) {//시작값을 하나씩 올려서 오름차순으로만 나열
		if(cur==m) {
			for(int i=0; i<m;i++) {
				sb.append(arr[i] +" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start; i<=n;i++) {//오름차순으로 나열하면 자연스럽게 중복 제거
			arr[cur] = i;
			recur(cur+1, i+1);//재귀
		
		}
	}
	
	

}
