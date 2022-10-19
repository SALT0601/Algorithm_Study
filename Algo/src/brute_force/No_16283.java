package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_16283 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        int n = Integer.parseInt(st.nextToken());
	        int w = Integer.parseInt(st.nextToken());
	        int cnt=0;
	        int S=0, G=0; 
	        //브르트포스 알고리즘으로 양과 염소를 더한 범위를 반복문으로 돌려 해당하는 값을 추출
	        for(int i = 1; i< n; i++) {
	      	  if(i*a + (n-i)*b == w) { //양을 i로 두면 염소는 n-양이므로 w와 비교 가능
    			  cnt++;//해가 여러개 있을 케이스를 대비하여 카운트
	               S=i;
	               G=(n-i);
	            }
	          
	        }
	        if(cnt==1) System.out.print(S+" "+G); //해가 1개 있을때만 추출
	        else System.out.print(-1);
	}

}
