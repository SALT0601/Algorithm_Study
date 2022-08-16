package algo_cote;
import java.io.*;
import java.util.*;

public class No_14453 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrH = new int[n+1];
       int[] arrP = new int[n+1];
       int[] arrS = new int[n+1];
       String[] arrA = new String[n+1];
       arrA[0]="0";
       for(int i=1; i<n+1; i++) {
    	   arrA[i]=br.readLine();
       }
       for(int i =0; i<=n; i++) {
    	   arrH[i]=0;
    	   arrP[i]=0;
    	   arrS[i]=0;
       }
for(int i=1; i<=n;i++){
    if (arrA[i].equals("H")){
        arrH[i] = arrH[i-1] + 1;
        arrP[i] = arrP[i-1];
        arrS[i] = arrS[i-1];
    }else if(arrA[i].equals("P")) {
       arrH[i] = arrH[i-1];
        arrP[i] = arrP[i-1]+ 1;
        arrS[i] = arrS[i-1];
    }else if(arrA[i].equals("S")){
        arrH[i] = arrH[i-1];
        arrP[i] = arrP[i-1];
        arrS[i] = arrS[i-1]+ 1;
    }
   
} 

        
int ans = 0;
for (int i=1; i<=n;i++){
      int p_h = arrP[i-1] + (arrH[n] - arrH[i-1]); 
     int p_s = arrP[i-1] + (arrS[n] - arrS[i-1]); 
     int h_s = arrH[i-1] + (arrS[n] - arrS[i-1]); 
     int h_p = arrH[i-1] + (arrP[n] - arrP[i-1]); 
     int s_p = arrS[i-1] + (arrP[n] - arrP[i-1]); 
     int s_h = arrS[i-1] + (arrH[n] - arrH[i-1]); 
ans = Math.max(Math.max(ans, Math.max(p_h, p_s)), Math.max(Math.max(h_s, h_p), Math.max(s_p, s_h)));
}


System.out.println(ans);
	}        
}




