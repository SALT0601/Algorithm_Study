package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_2851 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int arr[] = new int[10];
		
		int max=0,s=0,e=s;
		int sum=0;
		for(int i=0; i<10;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		if(arr[0]==100) {
			System.out.println(100); //첫번째 값이 100이면 더 안해도 100이 답
		}else {
			while(s<=e) {
				if(e>9) { //e가 9인것도 더해야하므로 9이상일때 초기화
					s++;
					e=0;
					sum=0;
				}
				sum += arr[e];//1개씩 더해줌
				if((Math.abs(100-max))>(Math.abs(100-sum))) {//100과 가까운거 찾기 위해 비교
					max = sum;//현재 max 값이 100에서 멀다면 교체

					e++;
				}else if((Math.abs(100-max))==(Math.abs(100-sum))) {
					max = Math.max(max, sum);//만약 같은값이 나온다면 더 큰 수를 출력
					e++;
				}else {
					e++;
				}
				if(sum==100) break; //100이 나오면 멈춤
			}
			System.out.println(max);
	 
		}
		
	}

}
