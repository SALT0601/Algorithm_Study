package algo_cote;

import java.io.*;
import java.util.*;


public class No_1806_2 {
	//부분수열 합 - 백트래킹 네번째 방법
    static int n;
    static int s;
    static int[] arr;
    static int min = 100000;
    static int num = 0, cnt=0;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	s = Integer.parseInt(st.nextToken());
    	arr = new int[n];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n;i++) {
    		arr[i] = Integer.parseInt(st.nextToken());

    	}
 
    	Arrays.sort(arr); 
    	recur3(0,0,0);
    	System.out.println(min);
 
    	
    }

	private static void recur3(int cur, int sum, int cnt) {
	      if(cur==n-1){
	    	  if(sum == s) {
	    		  if(cnt<min) min = cnt;
	    		  
	    	  }
	    	  return;
	        }
	      
	      recur3(cur+1, sum+arr[cur], cnt+1);//현재 인덱스 선택하는 경우
	      recur3(cur+1, sum, cnt); //현재 인덱스 선택하지 않는 경우 -> 다음 recur땐 또 그 다음걸 선택하거나 선택하지 않음
	      //그래서 0+ arr[2] 같은 경우도 나올 수 있는거임
	    }
}