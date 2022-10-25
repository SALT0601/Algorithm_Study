package number_theory;

import java.io.*;

public class No_14232 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		 long k = Long.parseLong(br.readLine());
	         
	        int cnt=0;
	        long num=2;    //k랑 맞추지 않으면 타입 변화로 인해 시간이 걸림.....ㄷㄷ 
	        while(k!=1) {
	            if(num*num > k) {
	                break;
	            }//저번처럼 어차피 숫자는 해당 제곱수 이하로 나눠지므로 제곱 이하까지만 계산하고 나오기
	        	if(k%num==0) {
	        		cnt++;      
	        		sb.append(num);
	        		sb.append(" ");
	        		k= k/num;
	        	}else {
	        		num++;
	        	}
	        }
	        if(k>1) { //더이상 나눠지지 않는 남은수가 1 이상이면 출력
                
             cnt++;
	            sb.append(k);
	            }
		
	        System.out.println(cnt);
	       System.out.println(sb);
	}

}
