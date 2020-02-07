import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static int[][] arr = new int[100][100];
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}// end of input
			
			int max = 0;
			int sumRow, sumCol, sumCross = 0;
			
			//가로
			for (int i = 0; i < 100; i++) {
				sumRow = 0;
				for (int j = 0; j < 100; j++) {
					if(i==j){	// 대각선
						sumCross += arr[i][j];
					}
					sumRow += arr[i][j];
				}
				if(max < sumRow){
					max = sumRow;
				}
			}	
			if(max < sumCross){	// 첫 대각선 값
				max = sumCross;
			}
			sumCross = 0;	//대각선 합 초기화
			
			//세로			
			for (int j = 0; j < 100; j++) {
				sumCol = 0;
				for (int i = 0; i < 100; i++) {
					if(i==j){	// 대각선
						sumCross += arr[i][j];
					}
					sumCol += arr[i][j];
				}
				if(max < sumCol){
					max = sumCol;
				}
			}
			if(max < sumCross){	// 두번째 대각선 값
				max = sumCross;
			}
			
			System.out.println("#"+test_case+" "+max);
			
		}
	}
}
