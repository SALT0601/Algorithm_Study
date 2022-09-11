package algo_cote;

import java.io.*;
import java.util.*;


public class No_14225 {
	//부분수열 합 - 백트래킹 네번째 방법
    static int n;
    static int s;
    static int[] arr;
    static boolean [] visited;
    static int num = 0, cnt=0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	arr = new int[n];
    	visited = new boolean[100000*20 + 10]; //방문할 수 있는 수 전체를 배열로 만들어 줌
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n;i++) {
    		arr[i] = Integer.parseInt(st.nextToken());

    	}
 
    	Arrays.sort(arr); 
    	recur3(0,0);

    	 for(int i=0; i<visited.length;i++) {
    		 if(!visited[i]) {
    			 System.out.println(i); //false인 가장 첫번째 배열을 프린트하고 멈춤
    			 break;
    		 }
    		
    	 }
    }

	private static void recur3(int cur, int sum) {
	      if(cur==n){
	    	  visited[sum] = true; //부분수열의 합이 되면 배열을 방문해서 true로 만들어줌
	            return;
	        }
	      
	      recur3(cur+1, sum+arr[cur]);//현재 인덱스 선택하는 경우
	      recur3(cur+1, sum); //현재 인덱스 선택하지 않는 경우 -> 다음 recur땐 또 그 다음걸 선택하거나 선택하지 않음
	      //그래서 0+ arr[2] 같은 경우도 나올 수 있는거임
	    }
}