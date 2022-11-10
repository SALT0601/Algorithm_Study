package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class No_11720 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger bigNumber = new BigInteger(br.readLine());
		BigInteger bigNumber2 = new BigInteger("10");
		BigInteger sum =new BigInteger("0");
		for(int i=0; i<n;i++) {
			sum = bigNumber.remainder(bigNumber2).add(sum);
			bigNumber = bigNumber.divide(bigNumber2);
		}
		System.out.println(sum);
	}

}
