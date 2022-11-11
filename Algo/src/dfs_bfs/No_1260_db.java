package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_1260_db {
	static ArrayList <Integer> [] graph;
	static boolean [] visited;
	static boolean [] visitedB;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		graph = new ArrayList[n+1];
		for(int i=0; i<n+1;i++) {
			graph[i] = new ArrayList <>();
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		for(int i=1;i<n+1;i++) {
			Collections.sort(graph[i]);
		}
		
		visited = new boolean [n+1];
		visitedB = new boolean [n+1];
		dfs(v);
		System.out.println();
		bfs(v);
		
		
	}
	
	public static void dfs(int cur) {
		visited[cur] = true;
		System.out.print(cur + " ");
		
		for(int nxt : graph[cur]) {
			if(!visited[nxt]) {
				visited[nxt] = true;
				dfs(nxt);
			}
		}
		
	}
	
	public static void bfs(int cur) {
		visitedB[cur] = true;
		Queue<Integer> que = new LinkedList<>();
		que.add(cur);
		
		while(que.size()>0) {
			int num = que.poll();
			System.out.print(num + " ");
			for(int nxt : graph[num]) {
				if(!visitedB[nxt]) {
					visitedB[nxt] = true;
					que.add(nxt);
				}
			}
			
		}
		
	}


}
