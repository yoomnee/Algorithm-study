import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2567_������_200209 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());	//������ ����
		boolean[][] paper = new boolean[102][102];	//��ȭ��, �����̰� �پ������� true �ƴϸ� false(���� üũ �� �Ϸ��� ������ 2 �ø�)
		//������ ��ġ �Էº�
		for (int i = 0; i < num; i++) {	//������ ������ŭ �ݺ�
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())+1;
			int y = Integer.parseInt(st.nextToken())+1;
			for (int j = x; j < x+10; j++) {
				for (int j2 = y; j2 < y+10; j2++) {
					paper[j][j2] = true;
				}
			}
		}
		//true�� ���� �߰ߵǸ� �� ��ǥ�κ��� �����¿쿡 false�� �ִ��� üũ�ϰ�, �ִٸ� length ����
		int length = 0;
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper.length; j++) {
				if(paper[i][j]) {
					for (int d = 0; d < 4; d++) {	//������: +2, �ƴ� ��: +1
						if (!paper[i+dx[d]][j+dy[d]]) {
							++length;
						}
					}
				}
			}
		}
		System.out.println(length);
	}	//end of main
}	//end of class
