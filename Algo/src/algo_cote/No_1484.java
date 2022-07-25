package algo_cote;

import java.io.*;

public class No_1484 {   
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long s= 1;
		long e =2;
		
		boolean isSquare = false;
		while(e<1000000) {
			long ds = s*s;
			long de = e*e;
			if(de-ds == n) {
				System.out.println(e);
				isSquare = true;
			}
			
			if(de-ds >n){
				s++;
			}else {
				e++;
			}
		}
		
		if(!isSquare) {
			System.out.println(-1);
		}
	}
}
