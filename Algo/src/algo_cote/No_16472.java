package algo_cote;
import java.io.*;

public class No_16472 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int max = 1;
        int[] check = new int[26];  
        int cnt = 0;
        int s = 0, e=0;
        check[str.charAt(0)-'a']++;
        cnt++;

        while(true) {
            e++;
            if(e==str.length()) break;
            int num = str.charAt(e)-'a';
            check[num]++;
            if(check[num]==1) 
                cnt++;

            while(cnt>N) {    
                int num2 = str.charAt(s) - 'a';
                check[num2]--;

                if(check[num2]==0) 
                    cnt--;
                s++;
            }

            max = Math.max(max, e-s+1);
        }

        System.out.println(max);
    }
}

