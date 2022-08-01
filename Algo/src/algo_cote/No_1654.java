package algo_cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1654 {
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken()); 
    
        int[] arr = new int[k];
        for(int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        long max = arr[k-1]; 
        long min = 1; 
        long middle = 0;
        
        while(max >= min) {
            middle = (max+min)/2;
            
            long allCount = 0;
            
            for(int j=0; j<arr.length; j++) {
                
                allCount += arr[j]/middle;
            }
            
            if(allCount >= n) { 
                                         
                min = middle + 1;
                
            }else if(allCount < n) {
                
                max = middle - 1;              
            }          
        }
        System.out.println(max);     
    }
 
}