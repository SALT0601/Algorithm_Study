package dfs_bfs;
import java.io.*;
import java.util.*;
public class No_16562_d {
	static boolean[] visited;
	 static ArrayList<Integer>[] graph;
	 static int fee[][];
    static int sum =0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 학생수
        int N = Integer.parseInt(st.nextToken());
        // 친구관계 수 
        int M = Integer.parseInt(st.nextToken());
        
        //가진 돈
        long k = Integer.parseInt(st.nextToken());
        
        fee = new int[N+1][2];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N+1; i++) {
        	fee[i][0]= i;
        	fee[i][1]= Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(fee, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
	           }
	        });
        
        graph = new ArrayList[N+1];
        //숫자가 1부터 시작하니 0 인덱스 비우고 출발하는게 편함
        graph[0] = null;
        for (int i = 1; i <N+1 ; i++) {  
        	graph[i] = new ArrayList<>();       		
        }
        
        visited = new boolean[N + 1];//방문처리 위한 배열
        for (int i = 0; i < M; i++) {
           st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            graph[left].add(right);
            graph[right].add(left);
        }
    	
    	for(int i=1;i<=N;i++) {
    		if(visited[fee[i][0]]) continue;//방문처리 안된게 처음 연결요소의 시작점이라 연결요수 개수 알 수 있음
    		sum+=fee[i][1];
    		System.out.println(fee[i][0]);
    		dfs(fee[i][0]);
		}
    	
    	if(sum>k) System.out.println("oh no");
    	else System.out.println(sum);
      
    }
	 public static void dfs(int cur) {//dfs방문처리
		
	        visited[cur] = true;//graph[cur]에 내 주변 노드 들어있음
	        for (int next : graph[cur]) { //next에 graph[cur] 넣고 visited[next] 방문했으면 컨티뉴
	            if (visited[next]) {
	                continue;
	            }
	            dfs(next);//아니면  dfs(next)로 재귀방문
	         
	        }     
	 }

	}

