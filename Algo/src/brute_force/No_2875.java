package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2875 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        st = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(st.nextToken());
	        int m = Integer.parseInt(st.nextToken());
	        int k = Integer.parseInt(st.nextToken());
	        int cnt=0;
	        //배정인원 보다 현재 인원이 더 많을 경우가 존재하므로 더해서 값을 도출하는 것보다
	        //현재인원에서 점점 배정인원을 줄여나가 더이상 팀원을 만들 수 없는 인원까지 반복하는것이 좋다.
	        while(n>=2 && m>=1 && m+n>=3+k) {//팀 구성이 여학생 2명 남학생 1명 이므로 
	        	//여학생은 2명 이상 존재할때까지 반복해야하고 남학생은 1명이상 존재할때까지 반복
	        	// 여학생 + 남학생은 적어도 3명 + 인턴십 참가 인원 이상 존재해야함
	        	n = n-2; //여학생은 2명씩 빠짐
	        	m = m-1; //남학생은 1명씩 빠짐
	        	cnt++;
	        }
	        System.out.print(cnt);
	}

}
