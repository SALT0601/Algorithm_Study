package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_14888_b {
	static int n;
	static int arr[];
	static int mark[] = new int[4];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];//자리수
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		 st = new StringTokenizer(br.readLine());
   	     for (int i = 0; i < 4; i++) {
             mark[i] = Integer.parseInt(st.nextToken());
         }
	
		recur(1,arr[0]);
		System.out.println(max);
		System.out.println(min);
	}

	private static void recur(int cur, int sum) {
		if(cur==n) {
			max = Math.max(max, sum);
			min = Math.min(min, sum);
		}
		
		for(int i=0; i<4;i++) {// 연산자 경우의 수 탐색
			if(mark[i]>0) {//0 이상이어야 수행함
				mark[i]--;//연산자 방문하면 -1해줌
				switch (i) {
				case 0: {//연산자 중 하나와 숫자 2개 계속 연산
					recur(cur+1, sum+arr[cur]);
					break;			
				}
				case 1:{
					recur(cur+1, sum-arr[cur]);
					break;	
				}
				case 2:{
					recur(cur+1, sum*arr[cur]);
					break;	
				}
					
				default:
					recur(cur+1, sum/arr[cur]);
					break;	
				}
				mark[i]++;//빠져나가기 전 다시 원상복구해서 다음 탐색에도 쓸 수 있게 함
			}
			
		}
	}
	
	

}
