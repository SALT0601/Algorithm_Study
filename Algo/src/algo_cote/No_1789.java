package algo_cote;

import java.io.*;
import java.util.*;




public class No_1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long num=1;
		int cnt=0;
		while(n>=0) {
			n = n - num;
			cnt++;
			num++;
			if(n==0) {
				cnt++;
				break;
			}
		}
		cnt--;
		System.out.println(cnt);
	}

}
