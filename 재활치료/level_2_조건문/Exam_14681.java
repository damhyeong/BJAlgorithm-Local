package level_2_조건문;

import java.util.*;
import java.io.*;

/**
사분면 고르기 성공다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	230543	139269	120760	61.249%
문제
흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. 
"Quadrant n"은 "제n사분면"이라는 뜻이다.



예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

입력
첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. 
(−1000 ≤ y ≤ 1000; y ≠ 0)

출력
점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

예제 입력 1 
12
5
예제 출력 1 
1
예제 입력 2 
9
-13
예제 출력 2 
4
 */

public class Exam_14681 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > 0 && y > 0)
			bw.write("1");
		else if(x < 0 && y > 0)
			bw.write("2");
		else if(x < 0 && y < 0)
			bw.write("3");
		else if(x > 0 && y < 0)
			bw.write("4");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
