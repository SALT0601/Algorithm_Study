package algo_cote;
import java.io.*;
import java.util.*;
public class No_1644 {

	static boolean prime[];
	static ArrayList<Integer> arr = new ArrayList<>();
    
    public static void main(String[] args) throws Exception{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	 int n = Integer.parseInt(br.readLine());

    	 prime = new boolean[n+10];        
         prime[0] = prime[1] = true;  
         prime[2] = false;
         for(int i=0; i*i<=n; i++){
        	 if (!prime[i]) {
                 for (int j = i + i; j <= n; j+=i) {
                     prime[j] = true;
                 }
             }     
         }            
         for (int i = 0; i <= n; i++) {
             if (!prime[i]) arr.add(i);
         }
         arr.add(0);
        
         int cnt=0, s=0, e=0;
         int total = arr.get(0);
            while(e<arr.size()-1){
                if (total == n){
                    cnt+=1;
                    total -= arr.get(s);   
                    s+=1;
                    e+=1;
                    total += arr.get(e);   
                }else if(total < n) {
                    e+=1;
                    total += arr.get(e); 
                }else{
                    total -= arr.get(s);
                    s+=1;
                }
            }
         System.out.println(cnt);
     }
 }
