package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class No_1_10문자거리 {
	public static int[] solution(String str, char t) {	
	
			 //해설 코드 - 왼쪽 오른쪽 for문 두번 돌기
			int[] ans = new int[str.length()];
			int p = 100; //일단 가장 큰 값으로 잡고 시작.
			
			for(int i=0; i<str.length();i++) {
				if(str.charAt(i) == t) {
					p=0;
					ans[i]=p;
				}
				else {
					p++;
					ans[i] = p;
				}
			}
			
			p = 100; //다시 초기화
			for(int i=str.length()-1; i>=0;i--) {
				if(str.charAt(i) == t) {
					p=0; //이미 오른쪽에서 돌았기때문에 0만 가지면 됨
				}
				else {
					p++;
					ans[i] = Math.min(ans[i], p);//오른쪽 왼쪽으로 돌아서 나온 값중 작은걸 넣어야함
				}
			}
			
			return ans;
	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();	
		char c = st.nextToken().charAt(0);
		for(int x : solution(str, c)) {
			System.out.print(x+" ");
		}
		
	}

}
