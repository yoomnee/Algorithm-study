import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//�� 1���� ���� �޴� �ð��� ����.
//�� 2���� ���� �޴� �ð��� ����.
//�� 1�� ���� ���

public class BJ_2991_������_200209 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] DogsPattern = new int[4];		//�� �� ������ ������ �ϳ��� �迭�� ����
		for (int i = 0; i < DogsPattern.length; i++) {
			DogsPattern[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] menPattern = new int[3];	//������� � �ð��� ������ �ϳ��� �迭�� ����
		for (int i = 0; i < menPattern.length; i++) {
			menPattern[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < menPattern.length; i++) {	//��� ����ŭ �ݺ�
			int cnt = 0;	//�� ����� ���ݹ޴� ��
			//�� 1�� �������� �ʴ� �ð��� �Դ��� üũ -> ���̸� �״�� cnt ��ȯ, �����̸� cnt ���� �� ��ȯ
			cnt = menPattern[i] % (DogsPattern[0]+DogsPattern[1]) > DogsPattern[0] || menPattern[i] % (DogsPattern[0]+DogsPattern[1]) == 0 ? cnt : ++cnt;
			//�� 2�� �������� �ʴ� �ð��� �Դ��� üũ -> ���̸� �״�� cnt ��ȯ, �����̸� cnt ���� �� ��ȯ
			cnt = menPattern[i] % (DogsPattern[2]+DogsPattern[3]) > DogsPattern[2] || menPattern[i] % (DogsPattern[2]+DogsPattern[3]) == 0 ? cnt : ++cnt;
			System.out.print(cnt + " ");
		}
	}	//end of main

}	//end of class
