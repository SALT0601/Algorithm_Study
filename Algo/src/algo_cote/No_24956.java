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
            prefix[i] = prefix[i-1] + (Character.compare(str[i], 'W'));
        }
        for(int i=n; i>=1;i--){
            suffix[i] = suffix[i+1] + (Character.compare(str[i], 'E'));
        }
        
        two[0]=1;
          for(int i=1; i<200010;i++){
            two[i] = (2*two[i-1]) % MOD;
        }
        ans = 0;
          for(int i=1; i<=n;i++){
            if(Character.compare(str[i], 'H')==0) ans += prefix[i] * (two[(int) suffix[i]] - suffix[i] - 1);
              ans %= MOD;
        }
        
        System.out.println(ans);
	}        
}




