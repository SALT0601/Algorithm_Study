package number_theory;

import java.io.*;
import java.util.*;

public class No_1407 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 long a = Long.parseLong(st.nextToken());
	        long b = Long.parseLong(st.nextToken());
	        long result = 0;
	        
	        for(long i = 1; i<= b; i *= 2) {//2의 배수, 4의 배수 형식이어야 하므로 2씩 곱해줌
	        	//1~b까지를 더하고 1~a-1까지를 빼면 a~b까지 나옴
	            result += i*(b/i - b/(2*i)); //=> b/i - b/(2*i) 는 i의 배수인 것의 개수이므로 i를 곱해줌
	            result -= i*((a-1)/i - (a-1)/(2*i));
	        }
		
	        System.out.println(result);
	}

}
