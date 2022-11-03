package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No_12101_b {
	static int n,m;
	static int arr[];
	static ArrayList<String> nums;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		nums = new ArrayList<>();
		recur(0,0);
		if(nums.size()<m) {
			System.out.println(-1);
		}else {
			System.out.println(nums.get(m-1));
		}
		
	}

	private static void recur(int cur,int sum) {
		if(sum>n) {
			return; //n 넘어가면 리턴
		}
		if(sum==n) {
			String s="";
			for(int i=0;i<cur-1;i++) {
				s+= arr[i] + "+";
			}
			s+=arr[cur-1];
			nums.add(s);
			return;
		}
		
			for(int i=1;i<=3;i++) {//1,2,3 으로 이루어진 합이므로
				arr[cur] = i;
				recur(cur+1, sum+i);
			}
	}
}
