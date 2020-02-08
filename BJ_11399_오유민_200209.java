import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//���� �ɸ��� ���� �ð��� ������������ �����ϴ� ���� ����Ʈ
public class BJ_11399_������_200209 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());	//��� ��
		int[] time = new int[num];	//���� �ɸ��� �ð�
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time);	//����
		int sum = 0;	//��ΰ� ������ ���� ������ �ɸ��� �ð�
		for (int i = 0; i < num; i++) {
			sum += time[i]*(num-i);
		}
		System.out.println(sum);
	}	//end of main
}	//end of class
