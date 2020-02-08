import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2567_오유민_200209 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());	//색종이 개수
		boolean[][] paper = new boolean[102][102];	//도화지, 색종이가 붙어있으면 true 아니면 false(영역 체크 안 하려고 사이즈 2 늘림)
		//색종이 위치 입력부
		for (int i = 0; i < num; i++) {	//색종이 개수만큼 반복
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())+1;
			int y = Integer.parseInt(st.nextToken())+1;
			for (int j = x; j < x+10; j++) {
				for (int j2 = y; j2 < y+10; j2++) {
					paper[j][j2] = true;
				}
			}
		}
		//true인 곳이 발견되면 그 좌표로부터 사하좌우에 false가 있는지 체크하고, 있다면 length 증가
		int length = 0;
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper.length; j++) {
				if(paper[i][j]) {
					for (int d = 0; d < 4; d++) {	//꼭지점: +2, 아닌 곳: +1
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
