package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class No_2563 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st;
		int [][]visited = new int[100][100];
	
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][2];
		for(int i=0; i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=arr[i][0]; j<(arr[i][0])+10;j++) {
				for(int k=arr[i][1]; k<(arr[i][1])+10;k++) {
					visited[j][k] = 1;
					
				}
			}
		}
		for(int j =0;j<100;j++){
            for(int k=0;k<100;k++){
                if(visited[j][k]==1) cnt++;
            }
		}
		 System.out.println(cnt);
	}

}
