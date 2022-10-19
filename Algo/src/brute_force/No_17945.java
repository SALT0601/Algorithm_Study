package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_17945 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        
	        //브르트포스 알고리즘으로 범위의 전체값을 반복문으로 돌려 해당하는 값을 추출
	        for(int i = -1000; i<= 1000; i++) {
	            if(i*i + 2*i*a + b == 0) {
	                System.out.print(i);
	                System.out.print(" ");
	            }
	        }
	}

}
