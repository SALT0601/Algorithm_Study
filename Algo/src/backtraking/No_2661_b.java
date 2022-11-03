package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2661_b {
	static int n;
	static StringBuilder sb = new StringBuilder();
	static int arr[];
	static String nums;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];//자리수
		recur("");
		System.out.println(sb);
	}

	private static void recur(String res) {//1321 대입
		if(res.length()==n) {//크기 같으면 대입부터가 사전순으로 대입이었으므로 바로 출력하고 나감
			System.out.println(res);
			System.exit(0);
		}else {//1321이 n과 길이가 다르면 다시 반복
			for(int i=1; i<=3;i++) {
				if(isGoodFront(res+i)&&isGoodBack(res+i)) {//1312일 경우 둘다 true 
					recur(res+i);//재귀
				}
		    }	
		}
	}
	
	private static boolean isGoodBack(String numStr) {//뒤에서부터 순서대로 체크
		int strSize = numStr.length();
		int len = strSize/2;
		for(int i=1;i<=len;i++) {
			String front_str = numStr.substring(strSize-i-i, strSize-i);
			String behind_str = numStr.substring(strSize-i, strSize);
			if(front_str.equals(behind_str)) return false;
		}
		return true;
	}
	private static boolean isGoodFront(String numStr) {//앞에서부터 순서대로 체크
		int len = numStr.length()/2;
		for(int i=1;i<=len;i++) {
			String front_str = numStr.substring(0, 0+i);
			String behind_str = numStr.substring(0+i, 0+i+i);
			if(front_str.equals(behind_str)) return false;
		}
		return true;
	}

}
