package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1182_b {
	static int n,s;
	static int arr[];
	static int cnt=0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		arr = new int[n];
		s = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0 ;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		recur(0,0);
		if(s==0) {//sum의 초기값이 0이라 빈배열이 포함되므로 0일 경우 한번 빼줌
			cnt--;
		}
		System.out.println(cnt);
	}

	private static void recur(int cur, int sum) {
		if(cur==n) {
			if(sum==s) {
				cnt++;
			}
			return;
		}
			recur(cur+1, sum+arr[cur]); //현재 인덱스 선택해서 더할경우
			recur(cur+1, sum);//현재 인덱스 넘어갈 경우	
	}
}
