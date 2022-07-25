package algo_cote;

import java.io.*;

public class No_1484 {   
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long s= 1;
		long e =2;
		
		boolean flag = false;
		while(e<1000000) {
			long ps = s*s;
			long pe = e*e;
			if(pe-ps == n) {
				System.out.println(e);
				flag = true;
			}
			
			if(pe-ps >n){
				s++;
			}else {
				e++;
			}
		}
		
		if(!flag) {
			System.out.println(-1);
		}
	}
}
