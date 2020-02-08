import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1120_������_200209 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String shortS = st.nextToken();	//���̰� ���� ª�ų� ���� ���ڿ�
		String longS = st.nextToken();	//���̰� ���� �� ���ڿ�
		
		int min = Integer.MAX_VALUE;
		//�� ���ڿ��� ���� �պκк��� ª�� ���ڿ��� �� ~ �� ���ڿ��� ���� �޺κб��� ª�� ���ڿ��� ��
		for (int i = 0; i <= longS.length() - shortS.length(); i++) {
			String tmp = longS.substring(i);	//�̹� ���� �պκ��� �����
			int diffChar = 0;	//�ٸ� ���ڰ� �� ������ ���� ����
			for (int j = 0; j < shortS.length(); j++) {
				if (tmp.charAt(j) != shortS.charAt(j)) {	//���� �ٸ� ���ڶ��
					++diffChar;
				}
			}
			if (min > diffChar) {	//�� �� �񱳰� ���� �� min ���� �� �ؼ� �ٸ� ���ڰ� �� ���� ������� Ȯ��
				min = diffChar;	//�� ���� ����� �� ���� ����
			}
		}
		System.out.println(min);
	}	//end of main
}	//end of class
