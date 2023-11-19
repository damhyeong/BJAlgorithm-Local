package pack04_1차원배열;

import java.util.*;
import java.io.*;

/**
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1 
5
20 10 35 30 7
예제 출력 1 
7 35
 */

public class Exam_10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int fNum = Integer.parseInt(st.nextToken());
		int max = fNum;
		int min = fNum;
		
		for(int i = 1; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num >= max)
				max = num;
			if(num <= min)
				min = num;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(min + " " + max);
		System.out.print(sb);
	}

}
