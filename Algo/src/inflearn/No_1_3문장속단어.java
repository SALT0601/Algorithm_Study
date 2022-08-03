package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_3문장속단어 {
	/*해설코드
	 * split 방법
	 * public static String solution(String str) {
	 * 
	 * String ans = ""; int m = Integer.MIN_VALUE; //최대값으로 갱신해야하니 처음엔 가장 작은값으로 초기화
	 * String[] s = str.split(" "); for(String x:s) { int len = x.length();
	 * if(len>m) { m = len; ans =x; }
	 * 
	 * } return ans; }
	 * 
	 * indexOf 방법 -> 복잡...
	 * * public static String solution(String str) {
	 * 
	 * String ans = ""; int m = Integer.MIN_VALUE, pos;
	 while((pos=str.indexOf(' ')) != -1){	 	
	 	String tmp = str.substring(0, pox);
	 	int len = tmp.length();
	 	if(len>m) { m = len; ans =tmp; }
	 * str=str.substring(pos+1);
	 * } 
	 * if(str.length()>m) ans=str;//마지막 단어는 공백이 없어 while문에서 처리가 안되어 따로 처리
	 * return ans; }
	 */
	public static void main(String[] args) throws IOException {
		
		//해설코드
		//String str = br.readLine(); 
		//System.out.println(solution(str));
		
		//내코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String max = "";
		String[] arr = br.readLine().split(" ");
		for(int i=0; i<arr.length;i++) {
			if(max.length() < arr[i].length()) {
				max = arr[i];
			}
		}		
		System.out.println(max);
		
	}

}
