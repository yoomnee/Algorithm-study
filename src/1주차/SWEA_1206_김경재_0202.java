import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int n = sc.nextInt();	//가로의 길이
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}	//end of input
			
			int count = 0, max;
			boolean flag;
			//맨 왼쪽 두 칸과 맨 오른쪽 두 칸에는 건물이 지어지지 않는다
			for (int i = 2; i < arr.length - 2; i++) {	
				max = -1;
				flag = false;
				for (int j = i-2; j <= i+2; j++) {	// 좌우 2칸씩 확인
					if(j == i)continue;	// 본인은 체크 안함
					else if(arr[j]>=arr[i]){ 	// 본인 건물보다 크거나 같은 건물이있으면 x
						flag = false;
						break;
					}
					else if(max < arr[j]){	// 본인 건물보다 작으면 건물 높이를 체크
						max = arr[j];	
						flag = true;
					}
				}
				if(flag){
					count += arr[i] - max;
				}
			}
			
			System.out.println("#"+testCase+" "+count);
		}
	}
}
