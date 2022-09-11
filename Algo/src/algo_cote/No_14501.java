package algo_cote;

import java.io.*;
import java.util.*;


public class No_14501 {
	//부분수열 합 - 백트래킹 네번째 방법
    static int n;
    static int[] t;
    static int[] p;
    static int max = 0;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	n = Integer.parseInt(br.readLine());
    	t = new int[n];
    	p = new int[n];
    	StringTokenizer st;
 
    	for(int i=0; i<n;i++) {
    		st = new StringTokenizer(br.readLine());
    		t[i] = Integer.parseInt(st.nextToken());
    		p[i] = Integer.parseInt(st.nextToken());
    	}
 
    	recur4(0,0);
    	System.out.println(max);
 
    	
    }

	private static void recur4(int cur, int sum) {
		
	      if(cur==n){
	    	  max = Math.max(max, sum);
	    	  return;
	        }
	      if(cur>n) return; //없으면 java.lang.ArrayIndexOutOfBoundsException: 남, n+1이 퇴사일이기때문
	      recur4((cur+t[cur]), sum+p[cur]);//현재 인덱스 선택하는 경우
	      recur4(cur+1, sum); //현재 인덱스 선택하지 않는 경우 -> 다음 recur땐 또 그 다음걸 선택하거나 선택하지 않음
	      //그래서 0+ arr[2] 같은 경우도 나올 수 있는거임
	    }
}