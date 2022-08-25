package algo_cote;

import java.io.*;
import java.util.*;

public class No_3673 {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
  
        for(int i = 0; i < c; i++){
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<n; j++) {
            	arr[j]= Integer.parseInt(st.nextToken());
            }     
        int cnt=0;
        for(int j=0; j<n;j++) {
        	  int ans = arr[j];
        	  int e=j;
            while(e<n){  
          	  if(j==e) {
          		  ans = arr[j]; 
          	  }else {
          		  ans += arr[e];		
          	  } 
             if(ans % d == 0){
                 e++;
                 cnt++;  
             }else{
            	 e++;         
             }
        }
     
       }
         System.out.println(cnt);
        }
    }
}