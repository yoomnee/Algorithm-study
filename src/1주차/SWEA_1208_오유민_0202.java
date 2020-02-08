import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1208_오유민_0202 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int limit = Integer.parseInt(br.readLine());	//제한된 횟수
			int[] arr = new int[100];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {	//상자 쌓기
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0;
			for (int i = 0; i <= limit; i++) {	//제한된 횟수만큼 작업
				int max = 0;	//가장 상자가 많이 쌓여 있는 곳
				int min = 0;	//가장 상자가 적게 쌓여 있는 곳
				for (int j = 0; j < arr.length; j++) {
					if(arr[j]>arr[max])
						max = j;
					if(arr[j]<arr[min])
						min = j;
				}
				result = arr[max]-arr[min];
				if (result <= 1) {	//가장 높은 곳과 가장 낮은 곳의 차이가 1 이내면
					break; //작업 멈추기
				}
				arr[max]--;	//가장 높은 곳 상자 높이 낲추기
				arr[min]++;	//가장 낮은 곳 상자 높이 높히기
			}
			System.out.println("#" + testCase + " " + result);
		}	//end of a testCase
	}	//end of main
	
}	// end of class
