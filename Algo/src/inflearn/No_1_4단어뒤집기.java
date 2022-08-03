package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_4단어뒤집기 {
	public static String solution(String str) {
		
		 char[] chArr = str.toCharArray();
			String ans ="";
			for(int i=str.length()-1;i>=0;i--) {
				ans += chArr[i];				
			}
			return ans;
			//해설코드(스트링빌더 이용)
			//ArrayList<String> ans = new ArrayList<>();
			//for(String x : solution(n,arr)){
			//String tmp = new StringBulider(x).reverse().toString(); //스트링 빌더를 이용해 모든 문자를 거꾸로 바꾼뒤 스트링로 형변환
			//스트링 빌더 쓰면 불필요한 메모리 낭비 방지 가능하므로 스트링이 많을 때 쓰기 좋음(하나의 객체 이용해서 사용하므로)
			//ans.add(tmp);
			//}
			
			//직접 뒤집기(투포인터 방법)
			//for(String x : solution(n,arr)){
			//char[] srr = x.toCharArray();
			//int s=0, e=x.length()-1;
			//whlie(s<e){
			//char tmp =srr[s];
			//srr[s]=s[e];
			//s[e]=tmp;
			//s++;
			//e--;
			//	}
			//String tmp = String.valueOf(s); //스태틱으로 선언된 클래스 메서드로 스트링으로 형변환
			//ans.add(tmp);
			//}
			
		}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//이 방법은 완탐
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for(int i=0; i<n;i++) {
			arr[i]=br.readLine();
			System.out.println(solution(arr[i]));
		}		
		//해설코드
		//for(String x : solution(n,arr)){
		//System.out.println(x);
	//}
		
	}

}
