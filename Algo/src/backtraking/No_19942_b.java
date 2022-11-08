package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class No_19942_b {
	static int n;
	static int arrMin[]= new int[4];
	static ArrayList<String> arr = new ArrayList<>();
	static ArrayList<Integer> prices = new ArrayList<>();
	static int table[][];

	static int minNur = Integer.MAX_VALUE;
	static int minPrice = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		table = new int[n][5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0 ;i<4;i++) {	
			arrMin[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0 ;i<n;i++) {	//재료와 값
			st = new StringTokenizer(br.readLine());
			table[i][0] = Integer.parseInt(st.nextToken());
			table[i][1] = Integer.parseInt(st.nextToken());
			table[i][2] = Integer.parseInt(st.nextToken());
			table[i][3] = Integer.parseInt(st.nextToken());
			table[i][4] = Integer.parseInt(st.nextToken());
		}
		
		
		recur(0,0,0,0,0,0,"");
		Collections.sort(prices);//사전순 정렬
		Collections.sort(arr);
		if(minPrice==Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(prices.get(0));//가장 첫번째 값 출력
			System.out.println(arr.get(0));
		}
	
	}

	private static void recur(int cur, int pro, int fat, int car, int vita,int sum,String curs) {
		if(cur==n) {
			
			if(pro>=arrMin[0]&&fat>=arrMin[1]&&car>=arrMin[2]&&vita>=arrMin[3]) {
				if(minPrice>=sum) {//사전순 정렬 위해서
					if(minPrice>sum) {//클 경우 리스트 초기화하고 새로 값 넣음
						prices.clear();
						arr.clear();
						minPrice = sum;
						prices.add(sum);
						arr.add(curs);
					}else if(minPrice==sum) {//같을 경우 그대로 추가
						prices.add(sum);
						arr.add(curs);
					}
				
				}
			}
			return;
			
		}
			
			recur(cur+1, pro+table[cur][0], fat+table[cur][1],car+table[cur][2],vita+table[cur][3],sum+table[cur][4],curs+(cur+1)+" "); //현재 인덱스 선택해서 더할경우
			recur(cur+1, pro,fat,car,vita,sum,curs);//현재 인덱스 넘어갈 경우	
	}
}
