import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_8958_오유민_200209 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 0; testCase < TC; testCase++) {
			String ox = br.readLine();
			int score = 0;	//점수저장
			int serialO = 0;	//연속 O
			for (int i = 0; i < ox.length(); i++) {	//ox길이만큼 반복하면서 점수 주기
				if (ox.charAt(i) == 'O') {
					++serialO;
					score+= serialO;
				} else {	//O가 끊기면
					serialO = 0;
				}
			}
			System.out.println(score);
		}	//end of a testCase
	} //end of main
}	//end of class