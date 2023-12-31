package pack23_동적계획법1;

import java.util.*;
import java.io.*;

/**
크리보드
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	6685	2941	2339	43.187%
문제
크리보드는 kriii가 만든 신기한 키보드이다. 크리보드에는 버튼이 4개만 있으며, 하는 역할은 다음과 같다.

화면에 A를 출력한다.
Ctrl-A: 화면을 전체 선택한다
Ctrl-C: 전체 선택한 내용을 버퍼에 복사한다
Ctrl-V: 버퍼가 비어있지 않은 경우에는 화면에 출력된 문자열의 바로 뒤에 버퍼의 내용을 붙여넣는다.
크리보드의 버튼을 총 N번 눌러서 화면에 출력된 A개수를 최대로하는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
크리보드의 버튼을 총 N번 눌러서 화면에 출력할 수 있는 A 개수의 최댓값을 출력한다.

예제 입력 1 
3
예제 출력 1 
3
예제 입력 2 
7
예제 출력 2 
9
예제 입력 3 
11
예제 출력 3 
27

힌트
N = 3인 경우에 A, A, A를 눌러 A 3개를 출력할 수 있다.

N = 7인 경우에는 A, A, A, Ctrl-A, Ctrl-C, Ctrl-V, Ctrl-V를 눌러 9개를 출력할 수 있다.

N = 11인 경우에는 A, A, A, Ctrl-A, Ctrl-C, Ctrl-V, Ctrl-V, Ctrl-A, Ctrl-C, Ctrl-V, Ctrl-V 를 눌러 27개를 출력할 수 있다.
 */

public class Exam_11058 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		
	}

}
