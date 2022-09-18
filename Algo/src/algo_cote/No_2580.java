package algo_cote;

import java.io.*;
import java.util.*;


public class No_2580 {
	//2차원 백트래킹
    static int[][] arr = new int[9][9];
  
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	StringTokenizer st;
 
    	for(int i=0; i<9;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0; j<9;j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    		
    		
    	}
 
    	recur(0);
    
 
    	
    }

	private static void recur(int cur) {
		
	      int x= cur/9;
	      int y =cur%9;
	      
	      if(arr[x][y] !=0) recur(cur+1);
	      else {
	    	  for(int i=1; i<10;i++) {
	    		  arr[x][y] = i;
	    		  recur(cur+1);
	    	  }
	    	  
	    	  arr[x][y] = 0;
	      }
	    }
}