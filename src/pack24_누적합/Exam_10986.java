package pack24_누적합;

import java.util.*;
import java.io.*;

/**
나머지 합
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	36598	10416	7535	27.037%
문제
수 N개 A1, A2, ..., AN이 주어진다. 
이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

입력
첫째 줄에 N과 M이 주어진다. 
(1 ≤ N ≤ 106, 2 ≤ M ≤ 103)

둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. 
(0 ≤ Ai ≤ 109)

출력
첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.

예제 입력 1 
5 3
1 2 3 1 2
예제 출력 1 
7
 */

public class Exam_10986 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		long[] sum = new long[N + 1];
		int[] cnt = new int[M];
		long count = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			//sum[i] = (sum[i - 1] + arr[i]) % M;
			sum[i] = (arr[i] + sum[i - 1]) % M;
			
			if(sum[i] == 0)
				count++;
			
			cnt[(int) sum[i]]++;
		}
		
		for(int i = 0; i < M; i++) {
			if(cnt[i] > 1)
				count += (cnt[i] * (cnt[i] - 1)) / 2;
		}
		
		bw.write(Long.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
