package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1687 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int count[][] = new int[400][400]; 
		int data[][] = new int[400][400]; 
		int N=0, M=0, MIN=0;
		int ans = 0;
		int i, j, k;
		String str="";
		 N = Integer.parseInt(st.nextToken());
		 M = Integer.parseInt(st.nextToken());
		 for(i=0; i <N;i++) {
			 str += br.readLine();
		 }
		 
		 int cnt=0;
		    for (i = 1; i <= N; i++){
		        for (j = 1; j <= M; j++){
		        	if((int) str.charAt(cnt)==48) {
		        		data[i][j] = 0;
		        	}else {
		        		data[i][j]=1;
		        	}
		        	cnt++;
		            if (data[i][j] == 0){
		                count[i][j] = count[i - 1][j] + 1;
		               
		            }
		        }
		    }
		
		    for (i = 1; i <= N; i++){
		    	 
		        for (j = 1; j <= M; j++){
		            if (count[i][j] == 0){
		                continue;
		            }
		            MIN = 2000000000;

		            for (k = j; k >= 1; k--) {
		                if (count[i][k]<MIN){
		                    MIN = count[i][k];
		                }
		         
		                if ((j - k + 1)*MIN>ans){
		                    ans = (j - k + 1)*MIN;
		                  
		                }
		            }
		        }
		    }
		
	System.out.println(ans);
	}

}
