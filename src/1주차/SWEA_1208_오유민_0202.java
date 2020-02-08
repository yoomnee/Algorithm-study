import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1208_������_0202 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int limit = Integer.parseInt(br.readLine());	//���ѵ� Ƚ��
			int[] arr = new int[100];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {	//���� �ױ�
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0;
			for (int i = 0; i <= limit; i++) {	//���ѵ� Ƚ����ŭ �۾�
				int max = 0;	//���� ���ڰ� ���� �׿� �ִ� ��
				int min = 0;	//���� ���ڰ� ���� �׿� �ִ� ��
				for (int j = 0; j < arr.length; j++) {
					if(arr[j]>arr[max])
						max = j;
					if(arr[j]<arr[min])
						min = j;
				}
				result = arr[max]-arr[min];
				if (result <= 1) {	//���� ���� ���� ���� ���� ���� ���̰� 1 �̳���
					break; //�۾� ���߱�
				}
				arr[max]--;	//���� ���� �� ���� ���� �F�߱�
				arr[min]++;	//���� ���� �� ���� ���� ������
			}
			System.out.println("#" + testCase + " " + result);
		}	//end of a testCase
	}	//end of main
	
}	// end of class
