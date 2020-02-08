import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1206_오유민_0202 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int testCase = 1; testCase <= 10; testCase++) {
			int n = Integer.parseInt(br.readLine());	//가로 길이
			int[] arr = new int[n];
			int sum = 0;	//조망권 확보된 세대의 수
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			//건물 높이 입력 받기
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 2; i < n-2; i++) {
				int max = Integer.MIN_VALUE;
				for (int j = -2; j <= 2; j++) {	//주변 건물 조사
					if(max < arr[i+j] && j != 0) {	//주변 건물 중 가장 높은 건물의 높이 체크
						max = arr[i+j];
					}
				}
				//가장 높은 건물 높이가 현재 조망권 조사중인 건물높이보다 작으면 두 건물의 높이 차이를 sum에 더함, 그렇지 않으면 0을 더함.
				sum += (arr[i]-max > 0) ? arr[i]-max : 0;	
			}
			System.out.println("#" + testCase + " " + sum);
		}	//end of a testCase
		
	}	//end of main
}	//end of class
