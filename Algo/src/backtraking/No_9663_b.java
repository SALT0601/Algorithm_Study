package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_9663_b {
	static int n;
	static int cnt=0;
	static boolean visited[];
	static boolean visitedLeft[];
	static boolean visitedRight[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		visited =new boolean[n]; //각 줄마다 체크
		visitedLeft =new boolean[n*2]; //왼쪽 대각선 체크
		visitedRight =new boolean[n*2]; //오른쪽 대각선 체크
		recur(0);
		System.out.println(cnt);
	}

	private static void recur(int cur) {
		if(cur==n) {
			cnt++;
			return;
		}
		
		for(int i=0; i<n;i++) {
			if(visited[i]||visitedLeft[cur+i]||visitedRight[cur-i+n]) continue; //이미 방문한 위치면 넘어감 
			else {
				visited[i]=true; //방문하지 않았다면 방문처리
				visitedLeft[cur+i]=true; //방문하지 않았다면 방문처리- cur+i가 i의 왼쪽 대각선들
				visitedRight[cur-i+n]=true; //방문하지 않았다면 방문처리 - cur-i+n가 오른쪽 대각선들 -> n 더해준 이유는 음수나와서
				recur(cur+1);//재귀
				visited[i]=false;//재귀 이후에는 다시 방문처리 해제
				visitedLeft[cur+i]=false;
				visitedRight[cur-i+n]=false;
			}
		}
	}
	
	

}
