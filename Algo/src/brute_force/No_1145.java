package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1145 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int []arr = new int[5];
		 for(int i=0;i<5;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 //브르트포스 문제 적어도 3개 이상의 숫자에 대해 배수가 되어야 하므로 cnt를 세줌
		 int cnt=0, num=1;
		 while(cnt<3) {
			 for(int i=0; i<5;i++) {
				 if(num%arr[i]==0) cnt++; //숫자를 %했을때 나머지가 0인경우 cnt 증가
			 }
			 
			 if(cnt >= 3) {//cnt가 3개 이상이 되면 멈춤
				 break;
			 }else { //만약 3개가 안된다면 초기화하고 숫자를 증가시켜줌
				 cnt=0;
				 num++;
			 }
		 }
		 System.out.println(num); //적어도 3개이상이므로 cnt가 3이 나온 숫자를 출력
		
	}

}
