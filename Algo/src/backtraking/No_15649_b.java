package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_15649_b {
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	static int arr[];
	static boolean visited[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited =new boolean[n+1]; //몇진수까지 체크
		arr = new int[m];//자리수
		recur(0);
		System.out.println(sb);
	}

	private static void recur(int cur) {
		if(cur==m) {
			for(int i=0; i<m;i++) {
				sb.append(arr[i] +" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n;i++) {
			if(visited[i]) continue; //이미 방문한 숫자면 넘어감 
			visited[i]=true; //방문하지 않았다면 방문처리
			arr[cur] = i;
			recur(cur+1);//재귀
			visited[i]=false;//재귀 이후에는 다시 방문처리 해제
			
		}
	}
	
	

}
