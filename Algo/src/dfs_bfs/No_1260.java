package dfs_bfs;
import java.io.*;
import java.util.*;
public class No_1260 {
	static boolean[] visited;
	static boolean[] visited2;
    static ArrayList<ArrayList<Integer>> graph;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        // 정점 N개
        int N = Integer.parseInt(st.nextToken());
        // 간선 M개
        int M = Integer.parseInt(st.nextToken());
        //정점 시작 번호
        int V = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
     
        for (int i = 0; i < N+1; i++) {
        	// 노드 들  넣을 배열. 어떤 정점이 배열의 인덱스라 그 주변 노드들 넣을 것이므로 또 배열로 들어가야함.
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N + 1];//방문처리 위한 배열
        for (int i = 1; i < M+1; i++) {
           st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
           
            graph.get(a).add(b);;//a로 배열의 인덱스 가져오고 해당 인덱스에 연결될 노드인 b 넣어줌.
            graph.get(b).add(a);;//양방향 연결이므로 b에도 a가 연결되어있으므로 b에 해당하는 인덱스 가져와서 a 넣어줌
        }
    	for(int i=1;i<=N;i++) {
    		 // 이동 경우의 수가 다수 존재할 경우 작은 정점부터 이동해야 하므로 인접 리스트를 오름차순 정렬
			Collections.sort(graph.get(i));
		}
       
        dfs(V);
        visited2 = new boolean[N + 1];//방문처리 위한 배열
        System.out.println();
        bfs(V);

    }
	 public static void dfs(int cur) {//dfs방문처리
		
	        visited[cur] = true;//graph[cur]에 내 주변 노드 들어있음
	        System.out.print(cur + " ");
	        for (int next : graph.get(cur)) { //next에 graph[cur] 넣고 visited[next] 방문했으면 컨티뉴
	            if (visited[next]) {
	                continue;
	            }
	            dfs(next);//아니면  dfs(next)로 재귀방문
	        }
	 }
	 public static void bfs(int  start){//bfs방문처리
		 Queue<Integer> queue = new LinkedList<>();//Queue는 인터페이스라 인스턴스 생성 불가해 LinkedList로 생성
		   queue.offer(start); // == add last
	        visited2[start] = true;
	      
	        while(!queue.isEmpty()) {
	            int now = queue.poll(); // == pop first
	            System.out.print(now + " ");
	            for(int next : graph.get(now)) {
	                if (visited2[next]) {
	                    continue;
	                }
	                visited2[next] = true;
	                queue.offer(next);
	            }
	        }
	    }
	}

