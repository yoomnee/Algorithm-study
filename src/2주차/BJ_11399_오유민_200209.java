import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//각각 걸리는 인출 시간을 오름차순으로 정렬하는 것이 포인트
public class BJ_11399_오유민_200209 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());	//사람 수
		int[] time = new int[num];	//각각 걸리는 시간
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time);	//정렬
		int sum = 0;	//모두가 인출을 끝낼 때까지 걸리는 시간
		for (int i = 0; i < num; i++) {
			sum += time[i]*(num-i);
		}
		System.out.println(sum);
	}	//end of main
}	//end of class
