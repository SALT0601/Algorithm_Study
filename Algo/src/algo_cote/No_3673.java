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

      
        
        int s=0, e=1, cnt=0, ans=0;
                   while(e<n-1){
          ans += arr[s] + arr[e];
           if(ans % d != 0){
               e++;
           }else{
               s++;
               e = s+1;
               cnt++;
               
           }
       }
         System.out.println(ans);
        }

 
    }
}