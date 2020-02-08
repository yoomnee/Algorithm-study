import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//개 1에게 공격 받는 시간을 센다.
//개 2에게 공격 받는 시간을 센다.
//개 1과 같은 방법

public class BJ_2991_오유민_200209 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] DogsPattern = new int[4];		//개 두 마리의 패턴을 하나의 배열에 저장
		for (int i = 0; i < DogsPattern.length; i++) {
			DogsPattern[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] menPattern = new int[3];	//사람들이 어떤 시간에 오는지 하나의 배열에 저장
		for (int i = 0; i < menPattern.length; i++) {
			menPattern[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < menPattern.length; i++) {	//사람 수만큼 반복
			int cnt = 0;	//한 사람이 공격받는 수
			//개 1이 공격하지 않는 시간에 왔는지 체크 -> 참이면 0, 거짓이면 1 더하기
			cnt += menPattern[i] % (DogsPattern[0]+DogsPattern[1]) > DogsPattern[0] || menPattern[i] % (DogsPattern[0]+DogsPattern[1]) == 0 ? 0 : 1;
			//개 2가 공격하지 않는 시간에 왔는지 체크 -> 참이면 0, 거짓이면 1 더하기
			cnt += menPattern[i] % (DogsPattern[2]+DogsPattern[3]) > DogsPattern[2] || menPattern[i] % (DogsPattern[2]+DogsPattern[3]) == 0 ? 0 : 1;
			System.out.print(cnt + " ");
		}
	}	//end of main

}	//end of class
