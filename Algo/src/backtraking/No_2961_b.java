package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2961_b {
	static int n,s;
	static int arr[][];
	static int cnt=0;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][2];//맛 두가지
		StringTokenizer st ;
		for(int i=0 ;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		recur(0,1,0,0);//신맛은 곱이므로 1을 해줘야 0이 안나옴
		
		System.out.println(min);
	}

	private static void recur(int cur, int s, int b, int cnt) {
		if(cur==n) {
			if(cnt==0) {//최소 1개 이상 선택해야하므로 선택 안하면 넘어감
				return;
			}
			min = Math.min(min, Math.abs(s-b));
			return;
			
		}
	
			recur(cur+1, s*arr[cur][0], b+arr[cur][1], cnt+1); //현재 인덱스 선택해서 더할경우
			recur(cur+1, s,b,cnt);//현재 인덱스 넘어갈 경우	
	}
}
