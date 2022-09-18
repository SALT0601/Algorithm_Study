package algo_cote;

import java.io.*;
import java.util.*;




public class No_14247 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long  Hi[] = new long [(int) n];
		long  Ai[] = new long [(int) n];
		long  res=0, num=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			Hi[i] = Long.parseLong(st.nextToken());
			res += Hi[i];
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			Ai[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(Ai);
		for(int i=0; i<n;i++) {
			res += Ai[i] *i;
	/*	TreeMap<Long, Long> map = new TreeMap<>();
		
		for(int i=0; i<n;i++) {
			map.put(Ai[i],Hi[i]);
		}
		for(long i=0; i<100001;i++) {
			if(map.get(i)==null) continue;
			else {
				if(num ==n) break;
				System.out.println(map.get(i));
				res += map.get(i) + i*num;
				num++;
	
				
			}->너무 복잡*/ 
		}
		System.out.println(res);
	}

}
