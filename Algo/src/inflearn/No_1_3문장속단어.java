package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1_3����Ӵܾ� {
	
	public static String solution(String str) {
	
	 String ans = "";
		//���� for�� 
		for(char x : str.toCharArray()) //toCharArray()�� ���ڿ��� char�� �и��� ���ڹ迭�� ���� ����
		{
			if(Character.isLowerCase(x)) ans += Character.toUpperCase(x);
			//Character.isLowerCase(x)�� �ҹ������� Ȯ���ϴ� ��
			else ans += Character.toLowerCase(x);
		}
		return ans;
		//�ƽ�Ű�� Ǯ��
		/*
		 *for(char x : str.toCharArray()) //toCharArray()�� ���ڿ��� char�� �и��� ���ڹ迭�� ���� ����
		{
			if(x>=65&& x<=90) ans += (char)(x+32);
			//Character.isLowerCase(x)�� �ҹ������� Ȯ���ϴ� ��
			else ans += (char)(x-32);
		}
		 * */
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.print(solution(str));
		
		

	}

}
