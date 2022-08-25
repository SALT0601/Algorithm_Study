package algo_cote;


import java.io.*;
import java.util.*;

public class No_24956 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long[] prefix = new long[200010];
        long[] suffix = new long[200010];
        long[] two = new long[200010];
        int n = Integer.parseInt(br.readLine());
        String str0 = br.readLine();
        str0 = '#' + str0 + '#';
        char[] str = str0.toCharArray();
        long ans;
        int MOD = 1000000007;
        for(int i=1; i<=n; i++){
        	if(str[i]== 'W')  prefix[i] = prefix[i-1] + 1;
        	else  prefix[i] = prefix[i-1] +0;
           
        }
        for(int i=n; i>=1;i--){
        	if(str[i]== 'E')  suffix[i] = suffix[i+1] + 1;
        	else suffix[i] = suffix[i+1] + 0 ;
        }
        
        two[0]=1;
          for(int i=1; i<200010;i++){
            two[i] = (2*two[i-1]) % MOD;
        }
        ans = 0;
          for(int i=1; i<=n;i++){
            if(str[i]== 'H') ans += prefix[i] * (two[(int) suffix[i]] - suffix[i] - 1);
            else ans %= MOD;
        }
        
        System.out.println(ans);
	}        
}




