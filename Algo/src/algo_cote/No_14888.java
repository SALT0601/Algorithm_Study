package algo_cote;

import java.io.*;
import java.util.*;


public class No_14888 {

    static int n;
    static int m;
    static int[] numArr;
    static int[] oper= new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	n = Integer.parseInt(br.readLine());
    	numArr = new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n;i++) {
    		numArr[i] = Integer.parseInt(st.nextToken());
    	}
    	 st = new StringTokenizer(br.readLine());
    	  for (int i = 0; i < 4; i++) {
              oper[i] = Integer.parseInt(st.nextToken());
          }

    	recur2(1,numArr[0]);
        System.out.println(max);
        System.out.println(min);
    }

	private static void recur2(int cur, int num) {
		  if (cur == numArr.length) { 
	            max = Math.max(max, num);
	            min = Math.min(min, num);
	            return;
	        }
	        for (int i = 0; i < 4; i++) { // 연산자 경우의 수 탐색
	            if (oper[i] > 0) {//연잔자가 0 이상이어야 수행함
	            	oper[i]--;//연산자 방문하면 -1해줌
	                if (i == 0) {
	                	recur2(cur+1, num + numArr[cur]);//연산자 중 하나와 숫자 2개 계속 더해줌
	                } else if (i == 1) {
	                	recur2(cur+1, num - numArr[cur]);
	                } else if (i == 2) {
	                	recur2(cur+1, num * numArr[cur]);
	                } else {
	                	recur2(cur+1, num / numArr[cur]);
	                }
	                oper[i]++;//빠져나가기 전 다시 원상복구해서 다음 탐색에도 쓸 수 있게 함
	            }
	        }
	}
}