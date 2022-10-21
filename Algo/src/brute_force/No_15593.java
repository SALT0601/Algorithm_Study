package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class No_15593 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st;
		 int n= Integer.parseInt(br.readLine());
		 ArrayList<Integer>[] arr = new ArrayList[n]; //리스트로 이차원배열 만들어줌
		 for(int i=0;i<n;i++) {
			 st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[i] = new ArrayList<>();
			 arr[i].add(s); //라이프가드의 시작 시간
			 arr[i].add(e); //라이프 가드의 끝 시간 
		 }
		 
		 int ans =0;
		 for(int i=0;i<n;i++) {//n번 비교
			 boolean []visited = new boolean[1010]; //지나갔는지 체크 위한 배열
			 
			 for(int j=0;j<n;j++) {
				 if(j==i) continue;//하나씩 담당 라이프가드를 빼야하므로 i와 j가 같으면 넘어가게 하고 나머지 체크.
				 else {
					 for(int k=arr[j].get(0);k<arr[j].get(1);k++) {//범위는 시작 시간에서 끝시간-1
						 visited[k] = true;//그 범위의 시간을 지나갔는지 체크
					
					 }
				 }		
			 }
			 int cnt=0; //i 반복문이 돌아오면 초기화해야하므로 여기에 cnt 초기화
			 for(int j=0;j<1010;j++) { //방문 배열을 전부 체크
				 if(visited[j]) cnt++; //true 일때만 cnt 증가
			 }
			 ans = Math.max(ans, cnt); //ans와 cnt를 비교해 큰것을 재대입
		
		 
		 }
		 System.out.println(ans);//ans 출력하면 하나를 제외한 나머지의 라이프가드의 최고 커버 시간이 나옴
		 
	}

}
