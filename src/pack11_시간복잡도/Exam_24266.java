package pack11_시간복잡도;

import java.util.*;
import java.io.*;

/**
문제
오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.

MenOfPassion 알고리즘은 다음과 같다.

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
입력
첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.

출력
첫째 줄에 코드1 의 수행 횟수를 출력한다.

둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.

예제 입력 1 
7
예제 출력 1 
343
3

개인적 해석 : 
	* 중첩문이 3개이므로, 최고 차수는 3이다.
	* 모든 중첩문의 시작은 처음이며, n까지이다.
	* 즉, 시간 복잡도는 O(n^3)이다. 
 */

public class Exam_24266 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		Long time = n * n * n;
		
		StringBuilder sb = new StringBuilder();
		sb.append(time.toString() + "\n" + 3);
		System.out.println(sb);
	}
}
