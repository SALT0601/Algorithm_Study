package algo_cote;

import java.io.*;
import java.util.*;



public class No_5585 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int res=0;
		n = 1000 - n;
		
		res += n/500;
		n = n%500;
		res += n/100;
		n= n%100;
		res += n/50;
		n = n%50;
		res += n/10;
		n = n%10;
		res += n/5;
		n = n%5;
		res += n/1;
	    System.out.println(res);
	
	}

}
