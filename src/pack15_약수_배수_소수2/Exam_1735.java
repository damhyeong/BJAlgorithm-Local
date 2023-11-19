package pack15_약수_배수_소수2;

import java.util.*;
import java.io.*;

/**
문제
분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. 
A와 B는 모두 자연수라고 하자.

두 분수의 합 또한 분수로 표현할 수 있다. 
두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오. 
기약분수란 더 이상 약분되지 않는 분수를 의미한다.

입력
첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다. 
입력되는 네 자연수는 모두 30,000 이하이다.

출력
첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 빈 칸을 사이에 두고 순서대로 출력한다.

예제 입력 1 
2 7
3 5
예제 출력 1 
31 35
 */

public class Exam_1735 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int resultA = a * d + b * c; int resultB = b * d;
		int smaller = resultA >= resultB ? resultB : resultA;
		int bigger = resultA >= resultB ? resultA : resultB;
		int shareMax = getMaxNum(bigger, smaller);
		/*
		for(int i = smaller; i >= 2; i--) {
			if(resultA % i == 0 && resultB % i == 0) {
				resultA /= i; resultB /= i;
				break;
			}
		}*/
		resultA /= shareMax; resultB /= shareMax;
		bw.write(Integer.toString(resultA) + " " + Integer.toString(resultB));
		bw.flush();
		bw.close();
		br.close();
	}

	// 유클리드 호제법 사용 - 위키백과 참조 
	public static int getMaxNum(int big, int small){
		int newNum = big % small;
		if(newNum == 0)
			return small;
		else
			return getMaxNum(small, newNum);
	}
}
