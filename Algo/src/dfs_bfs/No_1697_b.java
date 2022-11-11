package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_1697_b {
	static int [] visited = new int[100001];
	static int k;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		if(n==k) System.out.println(0);
		else {
			bfs(n);
			System.out.println(visited[k]);
		}
				
	}
	static public void bfs(int cur) {	
		Queue<Integer> que = new LinkedList<>();
		que.add(cur);
		
		while(que.size()>0) {
			int num = que.poll();
			if(num==k) break;
			//3갈레로 나눠서 계속 반복해줌. 현재 노드는 이전 노트 +1 이므로 지나온 노드들의 개수를 알 수 있음
			if(num>0 && visited[num-1]==0 ) {
				que.add(num-1);
				visited[num-1] = visited[num]+1;//n-1일때 현재 위치 +1 해줌
			}
			if(num<100000 && visited[num+1]==0 ) {
				que.add(num+1);
				visited[num+1] = visited[num]+1;//n+1일때 현재 위치 +1 해줌 
			}
			if(num*2<=100000 && visited[num*2]==0 ) {
				que.add(num*2);
				visited[num*2] = visited[num]+1;//n*2일때 현재 위치 +1 해줌
			}
		}
	}

}
