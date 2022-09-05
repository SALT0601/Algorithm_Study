package algo_cote;

import java.io.*;
import java.util.*;


public class No_1759 {
	// 백트래킹 네번째 방법 이용
    static int l;
    static int c;
    static String[] arr;
    static int cnt=0;
    static String total="";
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	l = Integer.parseInt(st.nextToken());
    	c = Integer.parseInt(st.nextToken());
    	arr = new String[c];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<c;i++) {
    		arr[i] = st.nextToken().toString();

    	}
 
    	Arrays.sort(arr); 
    	recur4(0,total);

    }

	private static void recur4(int cur, String total) {
		
	      if(cur==c){
	            if(total.length() == l){
	                for(int i=0; i<l;i++) {
	                	char x = total.charAt(i);
	                	if(x=='a' || x=='i' || x=='u' || x=='e' || x=='o' ) cnt++;
	                }
	                if(cnt<1 || cnt>l-2){
	                    return;
	                }else System.out.println(total);
	            }
	            
	            return;
	        }
	      cnt =0;
	      recur4(cur+1, total+arr[cur]);//현재 인덱스 선택하는 경우
	      recur4(cur+1, total); //현재 인덱스 선택하지 않는 경우 -> 다음 recur땐 또 그 다음걸 선택하거나 선택하지 않음
	      //그래서 0+ arr[2] 같은 경우도 나올 수 있는거임
	    }
}