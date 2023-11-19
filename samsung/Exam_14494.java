
import java.util.*;
import java.io.*;
/**
다이나믹이 뭐예요?
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	512 MB	2812	1934	1649	70.864%
문제
안녕하세요~ 저는 오늘 다이나믹 프로그래밍(동적 계획법)을 설명하기 위해 등장한 욱제예요!
 다이나믹은 이름이 엄청 거창하지만 사실 이름에 비해 개념은 간단하답니다. 
 다이나믹의 기본 아이디어는 바로 이전에 계산한 값을 사용해서 
 (= 이미 계산된 값을 사용해서, 어려운 말로 메모이제이션 한다고 해요) 
 반복되는 똑같은 연산 횟수를 줄이는 거예요.

예를 들어서, 5번째 피보나치 수열을 구하는 F(5)의 동작 과정을 살펴볼게요.



같은 함수가 불필요하게 많이 호출되는 것을 볼 수 있죠? 
F(2)와 F(3)을 미리 구해놓고 F(4)를 구할 땐 미리 구해둔 F(2)와 F(3)의 값을 이용하면 불필요한 호출을 줄일 수 있어요. 
조금 엄밀하게 이야기 해볼게요. 수학적으로 피보나치 수열은 F(n) = F(n-1) + F(n-2)로 정의할 수 있죠? 
이 식을 세우는 과정을 점화식을 세운다고 해요. 
문제의 조건에 맞는 수식을 만들고 그 수식을 그대로 코드에 옮기면 아주 쉽게 다이나믹을 구현할 수 있어요.

물론 다차원 배열로도 가능해요! 오른쪽, 아래쪽으로만 움직일 수 있을 때, 
D[1][1]에서 D[x][y]까지 도달하는 경우의 수를 구하는 문제는 일일히 모든 경우를 다 계산할 필요 없이,
 D[i][j] = (i, j)에 도달하는 누적 경우의 수 = D[i-1][j] + D[i][j-1]를 세워서 해결할 수도 있죠.

어때요? 다이나믹 어렵지 않죠? 이제 문제를 풀어볼게요!

“→, ↓, ↘의 세 방향만 사용해서 한 번에 한 칸씩 이동할 때, 
왼쪽 위 (1, 1)에서 출발하여 오른쪽 아래 (n, m)에 도착하는 경우의 수를 구하여라.”

시작!

입력
n과 m이 주어진다. (1 ≤ n, m ≤ 1,000)

출력
(1, 1)에서 (n, m)에 도달하는 경우의 수를 구하여라. 
단, 경우의 수가 엄청 커질 수 있으므로 경우의 수를 1,000,000,007(=109+7)로 나눈 나머지를 출력한다.

예제 입력 1 
3 2
예제 출력 1 
5
예제 입력 2 
4 5
예제 출력 2 
129
예제 입력 3 
1000 1000
예제 출력 3 
910657857
 */

public class Exam_14494 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
		
		long[][] arr = new long[n][m];
		for(int i = 0; i < n; i++)
			arr[i][0] = 1;
		for(int i = 0; i < m; i++)
			arr[0][i] = 1;
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				arr[i][j] += (arr[i - 1][j] % 1000000007) + (arr[i - 1][j - 1] % 1000000007) + (arr[i][j - 1] % 1000000007);
				arr[i][j] %= 1000000007;
			}
		}
		
		bw.write(Long.toString(arr[n - 1][m - 1]));
		bw.flush();
		bw.close();
	}

}
