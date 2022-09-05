package algo_cote;

import java.io.*;
import java.util.*;


public class No_2961 {
	// 백트래킹 네번째 방법 이용
    static int n;
    static int[][] arr;
    static int ans=1000000000;
    static String total="";
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    	n = Integer.parseInt(br.readLine());

    	arr = new int[n][2];

    	for(int i=0; i<n;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    			arr[i][0] = Integer.parseInt(st.nextToken());//2개뿐이니 2중 for문 안써도 됨
    			arr[i][1] = Integer.parseInt(st.nextToken());
    		
    	}
 
    	recur4(0,1,0,0);
    	System.out.println(ans);

    }

	private static void recur4(int cur, int a, int b, int cnt) {
			
	      if(cur==n){
	            if(cnt==0) {return;
	            }else{
	            	ans = Math.min(ans, Math.abs(a-b)); 
	            	return;
	            }
	        }
	      recur4(cur+1, a*arr[cur][0],b+arr[cur][1],cnt+1);
	      recur4(cur+1, a,b, cnt);
	    }
}