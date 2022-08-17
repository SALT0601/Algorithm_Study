package algo_cote;

import java.io.*;
import java.util.*;


public class No_24525 {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char arr[] = str.toCharArray();
        int num=0;
        int check=0;
        int cntS=0;
        String ans ="";
        for(int i=0; i<arr.length; i++) {
        	if(Character.compare(arr[i], 'S')==0) {
        		cntS++;
        		for(int j=i-1; j>=0; j-- ) {
        			if(Character.compare(arr[j], 'K')==0) {
        				num = j+1;
        				
        			}
        			
        		}
     
        	}
        	
        }
     
       for(int i=num; i<arr.length;i++) {
    	   ans += arr[i];
       }
       if(ans=="") {
     	  check=1;
       }
       char arr2[] = ans.toCharArray();
       int cnt=0;
       String res = "";
       for(int i=0; i<arr2.length;i++) {
    	   res+= arr2[i];
    	   if(Character.compare(arr[i], 'K')==0) {
    		   cnt++;
    	   }
    	   if(cnt > cntS*2 ) {
    		   break;
    	   }
    	   
       }
       if(check == 1) {
       	System.out.println(-1);
       }else {
    	   System.out.println(res.length());
       }
   
    }
}