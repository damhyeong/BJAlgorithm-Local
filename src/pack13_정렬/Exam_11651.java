package pack13_정렬;

import java.util.*;
import java.io.*;

/**
문제
2차원 평면 위의 점 N개가 주어진다. 
좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 
둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

출력
첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

예제 입력 1 
5
0 4
1 2
1 -1
2 2
3 3
예제 출력 1 
1 -1
1 2
2 2
3 3
0 4
 */

public class Exam_11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[N][2];
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			matrix[i][0] = Integer.parseInt(st.nextToken());
			matrix[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(matrix, new Comparator<int[]>() {
			@Override
			public int compare(int[] m1, int[] m2) {
				if(m1[1] == m2[1])
					return m1[0] - m2[0];
				else 
					return m1[1] - m2[1];
			}
		});
		
		for(int i = 0; i < N; i++) {
			bw.write(matrix[i][0] + " " + matrix[i][1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
