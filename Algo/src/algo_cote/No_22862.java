package algo_cote;
import java.io.*;
import java.util.*;
 
public class No_22862 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        boolean [] check = new boolean[n+1];
        int[] arr= new int[n+1];
        for(int i=1; i<=n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i]=num;
            if(num%2!=1){
                check[i]=true;
            }
        }
        int max=0, count=0;
        int s=1, e=1;
        while (e<=n){
            if(count<k){ 
                if(!check[e]){
                    count++;
                }
                e++;
                max = Math.max(max,e-s-count);
            }
            else if(check[e]){ 
                e++;
                max = Math.max(max,e-s-count);
            }
            else if(count==k && !check[e]){ 
                if(!check[s]){ 
                    count--;
                }
                s++;
            }    
        }
        System.out.println(max);
 
    }
}