package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1806 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i =0; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int f=0,e=0,res=Integer.MAX_VALUE;
		int sum = 0;
		 while (true) {
	            if (sum >= S) { 
	                sum -= arr[f];
	                res = Math.min(res, (e - f)); 
	                f++; 
	            } else if (e == N) { 
	                break;
	            } else {
	                sum += arr[e++];
	            }
	        }
		if(res == Integer.MAX_VALUE) System.out.println("0");
        else System.out.println(res);
	}

}
