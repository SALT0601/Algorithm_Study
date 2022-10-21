package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_14697 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int []arr = new int[4];
		 for(int i=0;i<4;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 int r=0, r2=0, r3=0;
		 int cnt=0;
		 for(int i=0;i<=50;i++) { //브르트포스로 무작위 대입
			 r = i*arr[0]; //방 개수를 0~최대인 50까지 전부 대입해서 총인원과 같다면 cnt에 1 대입
			 for(int j=0; j<=50;j++) {
				 r2 = j*arr[1];
				 for(int k=0; k<=50;k++) {
					 r3 = k*arr[2];
					 if(r+r2+r3 == arr[3]) {
						 cnt=1;
						 break;
					 }
				 }
			 }
		 }
		 System.out.print(cnt);
		
	}

}
