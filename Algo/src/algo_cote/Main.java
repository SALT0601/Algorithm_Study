package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int cnt= 0;
	static char []arr = {'T', 'i', 'm', 'u', 'r'};
	static boolean visited[] = new boolean[5];  
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t;i++) {
			int n = Integer.parseInt(br.readLine());
		    String name = br.readLine();
		    fun(n,name);			
			if(n==5 && cnt==5) System.out.println("YES");
			else  System.out.println("NO"); 
			cnt=0;
		}
		
		
		
	}
	
	public static void fun(int num, String name) {
		char []nameArr = name.toCharArray();		
		for(int i=0; i< num; i++) {
			for(int j=0; j<5;j++) {
				if(visited[j]==true) continue;
				if(nameArr[i]==arr[j]) {
					visited[j]=true;
					cnt++;
					
				}
			}		
		}
		
		for(int i=0; i<5;i++) {
			visited[i] = false;
		}
		 
		return;
	}

}
