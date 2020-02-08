import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1206_������_0202 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int testCase = 1; testCase <= 10; testCase++) {
			int n = Integer.parseInt(br.readLine());	//���� ����
			int[] arr = new int[n];
			int sum = 0;	//������ Ȯ���� ������ ��
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			//�ǹ� ���� �Է� �ޱ�
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 2; i < n-2; i++) {
				int max = Integer.MIN_VALUE;
				for (int j = -2; j <= 2; j++) {	//�ֺ� �ǹ� ����
					if(max < arr[i+j] && j != 0) {	//�ֺ� �ǹ� �� ���� ���� �ǹ��� ���� üũ
						max = arr[i+j];
					}
				}
				//���� ���� �ǹ� ���̰� ���� ������ �������� �ǹ����̺��� ������ �� �ǹ��� ���� ���̸� sum�� ����, �׷��� ������ 0�� ����.
				sum += (arr[i]-max > 0) ? arr[i]-max : 0;	
			}
			System.out.println("#" + testCase + " " + sum);
		}	//end of a testCase
		
	}	//end of main
}	//end of class
