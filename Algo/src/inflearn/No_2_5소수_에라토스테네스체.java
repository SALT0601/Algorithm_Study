package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class No_2_5소수_에라토스테네스체 {
	public static int solution(int n) {	
			
			//내코드 -이중for문 -> 시간초과됨
		//int ans=0;
		//for(int i=2; i<n;i++) {
		//	int cnt=0;
		//	for(int j=2; j<i*i;j++) {
		//		if(i%j==0) cnt++;
		//	}
		//	if(cnt==1) ans++;
		//}
		//	return ans;	
		int ans =0;
		int [] ch = new int[n+1]; //인덱스가 n번까지 생겨야함
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				ans++;
				for(int j=i; j<=n; j= j+i) ch[j]=1; //i의 배수로 돌아야 하므로 j+i
				//i의 배수 체크해서 1로 놓기
			}
		}
		return ans;
		

	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));

	}

}
