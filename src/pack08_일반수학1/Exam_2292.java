package pack08_일반수학1;


import java.util.*;
import java.io.*;

/**
위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
숫자 N이 주어졌을 때, 
벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

입력
첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.

출력
입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

개인적 해석:
1번째 줄 : 1개
2번째 줄 : 6개
3번째 줄 : 12개
4번째 줄 : 18개

겹을 감싸고 있는 줄이 처음 증가 외에 6개씩 증가한다.
처음 카운트 1로 초기화,
세야 할 숫자는 6씩 증가하는 것으로 세팅.

최소 경로는 중앙에서부터 시작하므로, 몇 번째 줄에 해당하는 숫자인지 알게된다면 해당 줄이 몇 개의 방을 지나는지 알게된다.


예제 입력 1 
13
예제 출력 1 
3
 */

public class Exam_2292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int line = 1; 
		int lastNum = 1;
		
		
		while(n > lastNum) {
			lastNum += line * 6;
			line++;
		}
		
		System.out.println(line);
	}

}
