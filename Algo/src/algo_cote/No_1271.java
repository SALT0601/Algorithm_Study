package algo_cote;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class No_1271 { //BigInteger 이용 연습

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());
        System.out.print(n.divide(m) + "\n" + n.remainder(m));
}
}