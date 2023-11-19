package pack15_약수_배수_소수2;

import java.util.*;
import java.io.*;

/**
문제
정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.

출력
각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력한다.

예제 입력 1 
3
6
20
100
예제 출력 1 
7
23
101
 */

public class Exam_4134 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long T = Long.parseLong(br.readLine());
		
		while(T --> 0) {
			long l = Long.parseLong(br.readLine());
			
			if(l <= 2) {
				bw.write(Long.toString(2) + "\n");
				continue;
			}
			
			
			while(!isPrime(l)) {
				l++;
			}
			
			bw.write(Long.toString(l) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static boolean isPrime(long l1) {
		for(long i = 2; i * i <= l1; i++) {
			if(l1 % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
