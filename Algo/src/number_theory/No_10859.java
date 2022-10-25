package number_theory;

import java.io.*;

public class No_10859 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		if(!isNum(Long.parseLong(n))) {
			System.out.println("no");
		}else {
			if(!isPrime(Long.parseLong(n))) {
				System.out.println("no");
			}else {
				if(isPrime(change(Long.parseLong(n)))) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
			
		}
		
	}
	//3,4,7은 180도 뒤집으면 애초에 숫자가 안되므로 미리 제거
	public static boolean isNum(long num) {
		while(num>0) {
			if(num%10 == 3 || num%10 == 4 || num%10 == 7) {
				return false;
				
			}else {
				num = num/10;
			}
		}
		return true;
	}
    public static boolean isPrime(long num) {
        if (num == 1) return false; //1은 소수가 아님
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;//2부터 제곱수까지의 범위라 소수라면 0이 하나도 나오지 않음
        }
        return true;
    }
    public static long change(long num) {    
        long res = 0;
        while (num > 0) {
            if (num % 10 == 6) res = res * 10 + 9; //6이라면 9로 바꿈
            else if (num % 10 == 9) res = res * 10 + 6;//9라면 6으로 바꿈
            else
                res = res * 10 + num % 10; //둘다 아니라면 그대로 바꾸고 숫자 위치 앞뒤 바꿔줌
            num /= 10;
        }
        return res;
    }
}
