package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class No_2667 {
	static int[] findX = {0,0,1,-1};//상하 좌우 찾기 위해서 미리 배열 만들어줌
	static int[] findY = {1,-1,0,0};
	static int[][] map; //입력받을 지도
	static boolean[][] visited;//방문처리
	static int cntAll=0; //단지 수 
	static int []houses = new int [25*25]; //최대 가질 수 있는 집의 개수
	static int num=0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new int[n+2][n+2]; //가장자리가 범위보다 작거나 넘어가면 안되므로 공간 만들어줌
		visited = new boolean[n+2][n+2];
		
		for(int i=1; i<=n;i++) {
			String input = "j"; //1부터 가지기 위해 필요없는 문자 더 해줌
			input += br.readLine(); 
			for(int j=1;j<=n;j++) {
				map[i][j] = input.charAt(j)-'0'; //아스키코드로 변환된 숫자를 원래 숫자의 값으로 받으려면 0까지 있는 아스키코드 빼줌
			}
		}
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(map[i][j]==1 && !visited[i][j]) {//1이고 방문하지 않았을 경우
					cntAll++; //시작 노드라고 판단함. 단지 수를 세줌
					houses[num] = 1;//시작 노드 포함 개수를 세야하므로 1을 먼저 넣어줌
					dfs(i,j);//방문처리
					num++;//하나의 연결 요소가 끝났으므로 다음 배열에 단지 수를 넣어야 해서 num을 더해 인덱스를 넘겨줌
				}
			}
		}
		System.out.println(cntAll);
		Arrays.sort(houses); //오름차순 정렬
		for(int i=0; i<25*25;i++) {
			if(houses[i] ==0) continue;
			else System.out.println(houses[i]);
		}	
	}
	public static void dfs(int x, int y) {
		visited[x][y] = true; //방문처리
		
		for(int i=0; i<4;i++) {
			int fX = x + findX[i]; //상하좌우 판단
			int fY = y + findY[i];
			if(map[fX][fY]==1 && !visited[fX][fY]) {//상하좌우에도 1이 있고 방문하지 않았으면 방문처리 하러감
				houses[num]++;//현재 단지에 집 수 더해줌
				dfs(fX,fY);//반복
			}
		}	
	}

}
