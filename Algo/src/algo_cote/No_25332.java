package algo_cote;

import java.io.*;
import java.util.*;
 
public class No_25332 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();      
        
        int N = Integer.parseInt(br.readLine());
 
        int[] arrA = new int[N + 1];
        int[] arrB = new int[N + 1];
        long[] arr = new long[N + 1];
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        for(int i=1; i<N + 1; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }
 
        st = new StringTokenizer(br.readLine());
 
        for(int i=1; i<N+1; i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }
 
        for(int i=1; i<N+1; i++){
            arr[i] = arrB[i] - arrA[i];
        }
 
        for(int i=1; i<N+1; i++){
            arr[i] = arr[i-1] + arr[i];
        }
 
        long ans = 0;
        long cnt = 0;
 
        TreeMap<Long, Long> hm = new TreeMap<>();
 
        for(int i=1; i<N+1; i++){
            if(arr[i] == 0){
                ans++;                
            }
 
            if(hm.containsKey(arr[i] - 0)){
                cnt = hm.get(arr[i] - 0);
            }else{
                cnt = 0;
            }
            
            ans += cnt;
 
            long a = 1;
            
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }else{
                hm.put(arr[i], a);
            }
        }
 
        System.out.println(ans);
        
    }
}