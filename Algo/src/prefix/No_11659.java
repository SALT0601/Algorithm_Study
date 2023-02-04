package prefix;

import java.io.*;
import java.util.*;

public class No_11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr[] = new int [n+1]; 
		arr[0] = 0; //누적합을 위해 처음 값은 0으로 둠
		int prefix [] = new int [n+1]; //누적합을 배열로 저장
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<n+1;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			prefix[i] = prefix[i-1] + arr[i]; // 뒤의까지의 합과 그 앞의 수를 더하면 그 앞의 수까지의 합
		}
		
		
		for(int i=0; i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(prefix[b]-prefix[a-1]);
			//a~b까지의 누적이라면 b까지의 누적에서 a바로 전 수까지의 누적을 빼면됨
		}
		
	}
	
}
