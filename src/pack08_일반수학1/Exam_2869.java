package pack08_일반수학1;

import java.util.*;
import java.io.*;

/**
문제
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

예제 입력 1 
2 1 5
예제 출력 1 
4
예제 입력 2 
5 1 6
예제 출력 2 
2
예제 입력 3 
100 99 1000000000
예제 출력 3 
999999901
 */

public class Exam_2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int cnt = 0;
		
		if(V <= A) {
			// 하루만에 등반.
			System.out.printf("%d", 1);
		} else {
			if((V - A) % (A - B) == 0) {
				/**
				 * 몫이 정확히 나눠지므로, 처음에 첫 수 A를 뺐으므로 + 1
				 */
				System.out.printf("%d", (V - A) / (A - B) + 1);
			} else {
				/*
				 * 몫이 정확히 나눠지지 않으므로, 처음에 첫 수 A를 뺀 것, 그리고 나머지가 존재하므로 + 2 한다.
				 */
				System.out.printf("%d", (V - A) / (A - B) + 2);
			}
		}
		
		/*
		while(true) {
			sum += A;
			cnt++;
			if(V <= sum)
				break;
			sum -= B;
		}
		System.out.println(cnt);
		*/
	}

}
