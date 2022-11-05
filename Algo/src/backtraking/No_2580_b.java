package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2580_b {
	static int arr[][] = new int[9][9];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st ;
		for(int i=0 ;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0 ;j<9;j++) {		
				arr[i][j] = Integer.parseInt(st.nextToken());			
			}
		}
		
		recur(0,0);
	}

	private static void recur(int x, int y) {
		if(y==9) {
			x++;
			y=0;
		}
		if(x==9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');			
			}
			System.out.println(sb);
			System.exit(0);//exit 안하면 무한루프
		}
			
		if(arr[x][y] !=0) {
			recur(x,y+1);
		}else {
			for(int i=1; i<=9;i++) {
				if(checked(x,y,i)) {
					arr[x][y]= i;
					recur(x,y+1);
				}
				
				}
			arr[x][y] =0; //체크에 통과 못했다면 0으로 둠
			
		}
		
	
		
	}
	static boolean checked(int row, int col, int num) {
		
		//행 체크
		for(int i=0; i<9;i++) {
			if(arr[row][i]==num) {
				return false;
			}
		}
		
		//열 체크
		for(int i=0; i<9;i++) {
			if(arr[i][col]==num){
				return false;
			}
		}
		
		//9칸 구역 체크 
		int squareRow = (row/3)*3;//5라면 5/3 =1*3 을 통해 3부터 행 시작을 알 수 있음
		int squarrCol = (col/3)*3;
		for(int i=squareRow; i<squareRow+3;i++) {
			for(int j=squarrCol; j<squarrCol+3;j++) {
				if(arr[i][j]==num){
					return false;
				}
			}
		}
		return true;
	}
}
