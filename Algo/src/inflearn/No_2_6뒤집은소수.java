package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class No_2_6뒤집은소수 {
	/*
	 * private static boolean isPrime(int num) { if(num==1) return false; for(int
	 * i=2; i<num;i++) { //2부터 자기자신 전까지 약수 발견되면 false; if(num%i ==0) return false; }
	 * return true;//약수 없이 끝나면 true }
	 */
	public static int solution(String num) {	
			//풀이코드
			/*
			 * ArrayList<Integer> ans = new ArrayList<>(); for(int i=0; i<n;i++) { int tmp =
			 * arr[i]; int res =0; while(tmp>0) { int t = tmp%10; res=res*10+t; //숫자 뒤집기 위해
			 * 십의자리 이용 tmp = tmp/10; } if(isPrime(res)) ans.add(res); //소수 확인해서 true면 리스트에
			 * 추가 }
			 */
		//내코드
		char numArr[] = num.toCharArray(); //char배열로 만들어줌
		String ans ="";
		for(int i=numArr.length-1; i>=0;i--) {
			ans +=numArr[i];//뒤집어서 출력
		}
		int cnt=0, sosu=0;
		int res = Integer.parseInt(ans);
		for(int i=2; i<=res;i++) {
			if(res%i ==0) {//나머지가 0인경우 cnt 증가
				cnt++;
			}
		}
		if(cnt==1) sosu=res; //1일때만 소수임
		return sosu;
		

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			String num=st.nextToken();
			if(solution(num)==0) continue; //0일 경우 패스 - 소수가 아닌 경우
			System.out.print(solution(num)+" ");
		}
		//풀이코드
		/*
		 * int []arr= new int[n]; for(int i=0; i<n; i++) { arr[i] =
		 * Integer.parseInt(st.nextToken()); } for(int x : solution(n,arr)) {
		 * System.out.print(x+" "); }
		 */
	}

}
