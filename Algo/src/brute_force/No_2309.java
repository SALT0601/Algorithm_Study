package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_2309 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int [] arr = new int[9];
		 int sum =0;
	       for(int i=0; i<9;i++) {
	    	   arr[i] = Integer.parseInt(br.readLine());
	    	   sum += arr[i]; //전부 더해서 난쟁이 2명 찾게 해줌
	       }
	       Arrays.sort(arr);
	       //아닌 2개의 난쟁이만 빼면 되므로 2 난쟁이를 찾는 코드
	       int s=0, e=8;
	       while(s<e) {
	    	   if(arr[s]+arr[e]==sum-100) break;
	    	   else if(arr[s]+arr[e]>sum-100) {//100을 넘어간 수가 나오면 큰 수를 제외해야 하므로 
	    		   e--;//e를 줄여준다
	    	   }else s++;
	       }
	       for(int i=0; i<9;i++) {
	    	   if(arr[i]==arr[s]||arr[i]==arr[e]) continue;
	    	   else System.out.println(arr[i]);
	       }
	       
	}

}
