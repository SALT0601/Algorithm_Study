package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class No_10819_b {
	static int n;
	static int arr[];
	static int arrOut[];
	static ArrayList<Integer> max =new ArrayList <>();
	static boolean visited[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visited =new boolean[n]; 
		arr = new int[n];
		arrOut = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		recur(0);
		Collections.sort(max);//오름차순으로 정렬
		System.out.println(max.get(max.size()-1));//맨 마지막 값 출력
	}

	private static void recur(int cur) {//중복되지 않는 모든 경우의 수 더해서 배열에 넣음
		if(cur==n) {
			int nums =0;
			for(int i=0; i<n-1;i++) {
				nums += Math.abs(arrOut[i]-arrOut[i+1]);
				
			}
			max.add(nums);
			return;
		}
		
		for(int i=0; i<n;i++) {
			if(visited[i]) continue; //이미 방문한 숫자면 넘어감 
			visited[i]=true; //방문하지 않았다면 방문처리
			arrOut[cur] = arr[i];
			recur(cur+1);//재귀
			visited[i]=false;//재귀 이후에는 다시 방문처리 해제
			
		}
	}
	
	

}
