package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_19532 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int []arr = new int[6];
		 for(int i=0;i<6;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 //브르트포스 문제. 범위 안의 모든 수 대입
		 for(int x=-999; x<=999;x++) {
			 
			 for(int y=-999; y<=999;y++) {
				 if(arr[0]*x+arr[1]*y==arr[2] && arr[3]*x+arr[4]*y==arr[5]) {
					 System.out.println(x + " " +y);
				 }
			 }
		 }
	}

}
