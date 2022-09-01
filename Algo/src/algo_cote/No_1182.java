package algo_cote;

import java.io.*;
import java.util.*;


public class No_1182 {
	//부분수열 구하기 - 연속하지 않아도 됨 -> 백트래킹 네번째 방법 이용한것
    static int n;
    static int s;
    static int[] arr;
    static int num = 0, cnt=0;
    static StringBuilder sb = new StringBuilder();
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
    	recur3(0,0);
    	  if(s==0){
              cnt--;
              System.out.println(cnt);
          }else {
              System.out.println(cnt);
          }
    }

	private static void recur3(int cur, int sum) {
	      if(cur==n){
	            if(sum == s){
	                cnt++;
	            }
	            return;
	        }
	      recur3(cur+1, sum+arr[cur]);//현재 인덱스 선택하는 경우
	      recur3(cur+1, sum); //현재 인덱스 선택하지 않는 경우 -> 다음 recur땐 또 그 다음걸 선택하거나 선택하지 않음
	      //그래서 0+ arr[2] 같은 경우도 나올 수 있는거임
	    }
}