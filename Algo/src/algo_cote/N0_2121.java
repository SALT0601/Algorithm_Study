package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N0_2121 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 static int n,m;
	 static String[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		
		ArrayList <Integer> arrX = new ArrayList<>();
		ArrayList <Integer> arrY = new ArrayList<>();
		
		 arr = new String[n];
		for(int i =0; i<n;i++) {
			arr[i]= br.readLine();
			arr[i] = arr[i].replace(" ", "");
			System.out.println(arr[i]);
			
		}
		for(int i=1;i<n;i++) {
			if(arr[i-1] != arr[i])
			arrX.add(Integer.parseInt(arr[i-1])/10);
			arrY.add(Integer.parseInt(arr[i])%10);
			System.out.println(arrX.get(i));
			System.out.println(arrY.get(i));
		}
		
		int s=0, e=0, cnt=0;
	
	
	
	}
	
}
