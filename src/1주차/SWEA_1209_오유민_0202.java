import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1209_오유민_0202 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			int[][] arr = new int[100][100];	//2차원 배열 입력 받기
			
			int[] horizontal = new int[100];	//각 행의 max 값 저장할 배열
			int[] vertical = new int[100];	//각 열의 min 값 저장할 배열
			int diagonal1 = 0;	//대각선1: [0][0] - [99][99] 대각선 합 저장할 배열
			int diagonal2 = 0;	//대각선2: [0][99] - [99][0] 대각선 합 저장할 배열
			
			//입력받으면서 더해나가기
			for (int i = 0; i < arr.length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					horizontal[i] += arr[i][j];	//i행 값들 합하기
					vertical[j] += arr[i][j];	//j열 값들 합하기
					if(i == j) {	//대각선1 값들 합하기
						diagonal1 += arr[i][j];
					}
					if(i == arr.length-j) {	//대각선2 값들 합하기
						diagonal2 += arr[i][j];
					}
				}
			}
			
			int max = Integer.MIN_VALUE;	//행과 열, 각 합들 중 max 값 
			for (int i = 0; i < horizontal.length; i++) {
				if(max < horizontal[i])
					max = horizontal[i];
				if(max < vertical[i])
					max = vertical[i];
			}
			//max와 대각선들 비교하기
			max = max < diagonal1 ? diagonal1 : max < diagonal2 ? diagonal2 : max;
			
			System.out.println("#" + testCase + " " + max);
		}	//end of a testCase
	}	//end of main
}	//end of class
