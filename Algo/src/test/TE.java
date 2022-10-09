package test;

public class TE {

	public static void main(String[] args) {
		String[] log = {"11:22:33 aaaa come","11:22:33 bbbb come","11:22:33 cccc come"};
		String[][] time = new String[log.length][log.length];
		String[] id = new String[log.length];
		String[] word = new String[log.length];
		for(int i=0; i<log.length;i++) {
			time[i]= log[i].split(" ");
			System.out.println(time[i][0]);
			System.out.println(time[i][1]);
		}
		

	}

}
