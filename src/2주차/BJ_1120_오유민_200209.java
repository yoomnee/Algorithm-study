import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1120_오유민_200209 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String shortS = st.nextToken();	//길이가 보다 짧거나 같은 문자열
		String longS = st.nextToken();	//길이가 보다 긴 문자열
		
		int min = Integer.MAX_VALUE;
		//긴 문자열의 가장 앞부분부터 짧은 문자열과 비교 ~ 긴 문자열의 가장 뒷부분까지 짧은 문자열과 비교
		for (int i = 0; i <= longS.length() - shortS.length(); i++) {
			String tmp = longS.substring(i);	//이미 비교한 앞부분은 떼어내기
			int diffChar = 0;	//다른 문자가 몇 개인지 세는 변수
			for (int j = 0; j < shortS.length(); j++) {
				if (tmp.charAt(j) != shortS.charAt(j)) {	//서로 다른 문자라면
					++diffChar;
				}
			}
			if (min > diffChar) {	//한 번 비교가 끝난 후 min 값과 비교 해서 다른 문자가 더 적은 경우인지 확인
				min = diffChar;	//더 적은 경우라면 그 값을 저장
			}
		}
		System.out.println(min);
	}	//end of main
}	//end of class
