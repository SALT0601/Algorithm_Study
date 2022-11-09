package dfs_bfs;
import java.io.*;
import java.util.*;
public class No_2060 {
	static boolean[] visited;
	static boolean[] visited2;
    static ArrayList<Integer>[] graph;
    static int cnt =0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 정점 N개
        int N = Integer.parseInt(br.readLine());
        // 간선 M개
        int M = Integer.parseInt(br.readLine());
		
 
        graph = new ArrayList[N+1];
        //숫자가 1부터 시작하니 0 인덱스 비우고 출발하는게 편함
        graph[0] = null;
        for (int i = 1; i <N+1 ; i++) {  
        	graph[i] = new ArrayList<>();       		
        }

        StringTokenizer st;
        visited = new boolean[N + 1];//방문처리 위한 배열
        for (int i = 0; i < M; i++) {
           st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
           
            graph[left].add(right);
            graph[right].add(left);
        }
    	for(int i=1;i<=N;i++) {
    		 // 이동 경우의 수가 다수 존재할 경우 작은 정점부터 이동해야 하므로 인접 리스트를 오름차순 정렬
			Collections.sort(graph[i]);
		}
       
        dfs(1);
        visited2 = new boolean[N + 1];//방문처리 위한 배열
        System.out.println(cnt);
      
    }
	 public static void dfs(int cur) {//dfs방문처리
		
	        visited[cur] = true;//graph[cur]에 내 주변 노드 들어있음
	        for (int next : graph[cur]) { //next에 graph[cur] 넣고 visited[next] 방문했으면 컨티뉴
	            if (visited[next]) {
	                continue;
	            }
	            dfs(next);//아니면  dfs(next)로 재귀방문
	            cnt++;//방문한곳 체크되면 cnt 늘려줘서 크기 올려줌
	        }
	 }

	}

