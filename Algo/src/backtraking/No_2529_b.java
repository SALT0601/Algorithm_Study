package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class No_2529_b {
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	static int arr[]= new int[10];
	static String mark[];
	static List<String> result = new ArrayList<>();//0을 포함해야해서 문자열로
	
	static boolean visited[] = new boolean[10];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		mark = new String[n];
		for(int i=0; i<n;i++) {
			mark[i] = st.nextToken();
		}
		recur(0);
		Collections.sort(result);
		sb.append(result.get(result.size()-1)); //가장 큰값
   	    sb.append("\n");
   	    sb.append(result.get(0));//가장 작은값 넣음
   	     System.out.print(sb);
	}
	private static boolean check(String mark, int a, int b) {
		if(mark.equals(">")) {//만약 부등호가 >라면 a>b보다 크다
			return a>b;
		}else {
			return a<b;
		}
	}
	private static void recur(int cur) {
		if(cur>=2) {//비교할 숫자가 2개가 넘는순간
			if(!check(mark[cur-2],arr[cur-2],arr[cur-1])) return;//false면 부등호가 다른거라 그냥 넘어감
		}
		if(cur==n+1) {
			StringBuilder tmp = new StringBuilder();
			for(int i=0;i<n+1;i++) {
				tmp.append(arr[i]);//입력과 일치하는 값만 배열에 담음
			}
			result.add(tmp.toString());
			return;
		}
		
		for(int i=0; i<=9;i++) {
			if(visited[i]) continue;
			arr[cur] = i;
			visited[i] = true;
			recur(cur+1);//재귀
			visited[i] = false;
		}
	}
	
	

}
