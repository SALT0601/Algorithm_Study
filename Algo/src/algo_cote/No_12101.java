package algo_cote;

import java.io.*;
import java.util.*;


public class No_12101 {

    static int n, k;
    static int cnt=0;
    static int arr[];
    static int num =0;
    static ArrayList<String> ans = new ArrayList<>();
    static boolean[] check = new boolean[1000];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	k = Integer.parseInt(st.nextToken());
    	arr = new int[n];
    	recur1(0,0);

    	if(check[k]==false) System.out.println(-1);//k번째에 식이 없으면 -1 출력
    	else System.out.println(ans.get(k-1)); //k번째 수식 출력
    }

	private static void recur1(int cur,int sum) {
		sb = new StringBuilder();
		if(sum > n) return;//합이 n보다 크면 넘어감
		if(sum == n) {
			cnt++;//k번째 아닌거 체크 위해 cnt 더해줌
				for(int i=0; i<cur-1;i++) {
					sb.append(arr[i] + "+");
				}
				sb.append(arr[cur-1]);	//마지막에 +기호 빼주기위해 마지막 숫자는 따로 추가함	
			ans.add(sb.toString());
			check[cnt]=true;
			return;
		}
		//1, 2, 3의 합이라 3으로 정함
		for(int i=0; i<3;i++) {
			arr[cur]=i+1;
			recur1(cur+1, sum+i+1);

			
		}
	}
}