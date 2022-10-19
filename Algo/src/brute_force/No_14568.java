package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_14568 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=3; i<=n;i++) {//남규 남규는 영훈이 보다 2개 이상 많고 0이 아니므로 최소 3개부터 시작
			for(int j=1;j<=n-i;j++) {//영훈은 0이 아니므로 최소 1개부터 시작
				for(int k=2;k<=n-i-j;k++) {//택희 택희는 짝수개를 가지므로 최소 2개부터 시작
					if(i>=j+2 && k%2==0 && i+j+k==n) {
						cnt++;
					}
				}
			}
		}
		if(cnt==0)  System.out.println(0);
		else System.out.println(cnt);
 
	}

}
