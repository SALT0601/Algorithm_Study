package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1759_b {
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	static String arr[];
	static String arrPrint[];
	static boolean visited[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		visited =new boolean[m]; 
		arr = new String[m];
		arrPrint = new String[m];
		for(int i=0; i<m;i++) {
			arr[i] = st.nextToken();
		}
		Arrays.sort(arr);
		recur(0,0);
		System.out.println(sb);
	}

	private static void recur(int cur,int start) {
		
		if(cur==n) {
			int vowelCnt=0,consonant=0;
			for(int i=0; i<n;i++) {//모음과 자음 개수 체크
				if(arrPrint[i].equals("a")||arrPrint[i].equals("e")||arrPrint[i].equals("i")
						||arrPrint[i].equals("o")||arrPrint[i].equals("u")) {
					vowelCnt++;
				}else {
					consonant++;
				}
			}
			if(vowelCnt>=1 && consonant >=2) {//모음이 최소 1개 이상, 자음이 2개 이상일 경우만 sb에 추가
			for(int i=0; i<n;i++) {
				sb.append(arrPrint[i]);
			}
			sb.append("\n");
			}
			return;
		}
		
		
		for(int i=start; i<m;i++) {
			if(visited[i]) continue; //이미 방문한 숫자면 넘어감 
			visited[i]=true; //방문하지 않았다면 방문처리
			arrPrint[cur] = arr[i];
			recur(cur+1,i+1);//재귀
			visited[i]=false;//재귀 이후에는 다시 방문처리 해제
			
		}
	}
	
	

}
