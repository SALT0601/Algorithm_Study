package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_1����ã�� {
	public static int solution(String str, char t) {
		int ans=0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==t) {
				ans++;
			}
		}
		//���� for�� 
		//for(char x : str.toCharArray()) //toCharArray()�� ���ڿ��� char�� �и��� ���ڹ迭�� ���� ����
		//{
		//	if(x==t) ans++;
		//}
		return ans;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = br.readLine().charAt(0);
		System.out.println(solution(str, c));
		

	}

}
