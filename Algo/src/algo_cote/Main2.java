package algo_cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	static String s1 ="";
	static String s2 ="";
	static int check=0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			s1= br.readLine();
			 s2= br.readLine();
			 fun(n, s1,s2);
			if(check==1)System.out.println("YES");
			else System.out.println("NO");
			
		}
		
		
	}
	
	public static void fun(int num, String color, String color2) {
		color=color.replace("B", "G");
		color2=color2.replace("B", "G");
		if(color.equals(color2)) check = 1;
		else check = 2 ;
		
		return;
	}

}
