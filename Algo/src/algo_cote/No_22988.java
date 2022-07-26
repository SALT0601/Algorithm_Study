package algo_cote;

import java.io.*;
import java.util.*;;


public class No_22988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken());
		long x= Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int cnt=0;
		
		ArrayList<Long> arr = new ArrayList<>();
		for(int i =0; i <n;i++) {
			long tmp = Long.parseLong(st.nextToken());
			if(tmp==x) {
				cnt++;	
			}else {
				arr.add(tmp);
			}
		}
		Collections.sort(arr);
		int s =0, e=arr.size()-1;
		int remain =arr.size();
		while(s<e) {
			if((arr.get(s)+arr.get(e))*2>=x) {
				cnt+=1;
				remain -=2;
				s+=1;
				e-=1;
			}else {
				s+=1;
			}
		}
		System.out.println(cnt + (remain / 3));
	}

}
