import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1209_������_0202 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			int[][] arr = new int[100][100];	//2���� �迭 �Է� �ޱ�
			
			int[] horizontal = new int[100];	//�� ���� max �� ������ �迭
			int[] vertical = new int[100];	//�� ���� min �� ������ �迭
			int diagonal1 = 0;	//�밢��1: [0][0] - [99][99] �밢�� �� ������ �迭
			int diagonal2 = 0;	//�밢��2: [0][99] - [99][0] �밢�� �� ������ �迭
			
			//�Է¹����鼭 ���س�����
			for (int i = 0; i < arr.length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					horizontal[i] += arr[i][j];	//i�� ���� ���ϱ�
					vertical[j] += arr[i][j];	//j�� ���� ���ϱ�
					if(i == j) {	//�밢��1 ���� ���ϱ�
						diagonal1 += arr[i][j];
					}
					if(i == arr.length-j) {	//�밢��2 ���� ���ϱ�
						diagonal2 += arr[i][j];
					}
				}
			}
			
			int max = Integer.MIN_VALUE;	//��� ��, �� �յ� �� max �� 
			for (int i = 0; i < horizontal.length; i++) {
				if(max < horizontal[i])
					max = horizontal[i];
				if(max < vertical[i])
					max = vertical[i];
			}
			//max�� �밢���� ���ϱ�
			max = max < diagonal1 ? diagonal1 : max < diagonal2 ? diagonal2 : max;
			
			System.out.println("#" + testCase + " " + max);
		}	//end of a testCase
	}	//end of main
}	//end of class
