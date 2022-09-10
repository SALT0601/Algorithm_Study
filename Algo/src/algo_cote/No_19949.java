package algo_cote;

import java.io.*;
import java.util.*;


public class No_19949 {
	// 백트래킹 첫번째 방법 활용
    static int ans;
    static int[] arr;
    static int [] numArr;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	arr = new int[10];
    	numArr = new int[10];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<10;i++) {
    		numArr[i] = Integer.parseInt(st.nextToken());	
    	}
    	ans= 0;
    	recur1(0);
    	System.out.println(ans);

    }

	private static void recur1(int cur) {
			
	      if(cur==10){
	    	  int cnt =0; //다시 0으로 초기화
	    	  for(int i=0; i<10;i++) {
					if(arr[i] == numArr[i]) {
						cnt++; //정답과 비교해서 카운트
					}
	        }
	    	  if(cnt >= 5) { //5개 이상 맞으면 경우의 수 늘려줌
	    		  ans++;
	    	  }
	    	  return;
	      }
	      for(int i=1; i<=5;i++) {		
				if(cur>=2) { //인덱스가 2 이상이면 그전과 그 전전꺼와 비교해서 같으면 넘어감
					if(arr[cur-1] == i && arr[cur-2] == i) continue;
				}
				arr[cur] = i;
				recur1(cur+1);
			}
	    }
}