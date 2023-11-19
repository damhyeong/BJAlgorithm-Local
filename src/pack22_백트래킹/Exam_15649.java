package pack22_백트래킹;

import java.util.*;
import java.io.*;

/**
예제 입력 1 
3 1
예제 출력 1 
1
2
3
예제 입력 2 
4 2
예제 출력 2 
1 2
1 3
1 4
2 1
2 3
2 4
3 1
3 2
3 4
4 1
4 2
4 3
예제 입력 3 
4 4
예제 출력 3 
1 2 3 4
1 2 4 3
1 3 2 4
1 3 4 2
1 4 2 3
1 4 3 2
2 1 3 4
2 1 4 3
2 3 1 4
2 3 4 1
2 4 1 3
2 4 3 1
3 1 2 4
3 1 4 2
3 2 1 4
3 2 4 1
3 4 1 2
3 4 2 1
4 1 2 3
4 1 3 2
4 2 1 3
4 2 3 1
4 3 1 2
4 3 2 1

문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

 */

public class Exam_15649 {
	public static int M;
	public static Set<Integer> numMap;
	public static char[] chStr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); M = Integer.parseInt(st.nextToken());
		chStr = new char[M];
		numMap = new HashSet<>();
		getStr(N, 0, bw);
		bw.flush();
		bw.close();
		br.close();
	}

	public static void getStr(int N, int m, BufferedWriter bw) throws IOException {
		if(m == M) {
			for(int i = 0; i < chStr.length; i++) {
				bw.write(Character.toString(chStr[i]) + " ");
			}
			bw.newLine();
			return;
		}
		else {
			for(int i = 1; i <= N; i++) {
				if(numMap.contains(i))
					continue;
				else {
					numMap.add(i);
					chStr[m] = Character.forDigit(i, 10); // 새로 배운거 
					/*
					 * chStr[m] = Integer.toString(i).charAt(0); 이런 방법도 존재함.
					 */
					getStr(N, m + 1, bw);
					numMap.remove(i);
				}
			}
		}
	}
}
