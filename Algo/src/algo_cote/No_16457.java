package algo_cote;

import java.io.*;
import java.util.*;


public class No_16457 {

    static int n;
    static int m, k;
    static int[][] q;
    static int[] key;
    static int maxQuest;
  
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	k = Integer.parseInt(st.nextToken());
    	key = new int[n];
    	
    	q = new int[m][k];
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<k; j++) {
				q[i][j] = Integer.parseInt(st.nextToken());
			}
		}
   
    	recur3(1,0);
    	System.out.println("1");
    }

	private static void recur3(int cur, int start) {
		   if (cur == n) {
	            int passQuestCnt = getPassQuestCnt();
	            if (passQuestCnt > maxQuest) {
	                maxQuest = passQuestCnt;
	            }
	            return;
	        }

	        for (int i = start; i < 2 * n + 1; i++) {
	            key[cur] = i;
	            recur3(cur + 1, i + 1);
	        }
		
	}
	static int getPassQuestCnt() {
        Set<Integer> usedSet = new HashSet<>();
        int canPassCnt = 0;
        for (int usedKey : key) {
            usedSet.add(usedKey);
        }

        for (int y = 0; y < m; y++) {
            boolean canPass = false;
            for (int x = 0; x < k; x++) {
                if (!usedSet.contains(q[y][x])) {
                    canPass = false;
                    break;
                }
                canPass = true;
            }

            if (canPass) {
                canPassCnt++;
            }
        }
        return canPassCnt;
    }
}