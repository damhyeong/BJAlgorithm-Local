package pack04_1차원배열;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

/**

예제 입력 1 
1
2
3
4
5
6
7
8
9
10
예제 출력 1 
10

예제 입력 2 
42
84
252
420
840
126
42
84
420
126
예제 출력 2 
1

문제
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */

public class Exam_3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (Integer.parseInt(br.readLine()) % 42);
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] != arr[j]) {
					i = j - 1;
					cnt++;
					break;
				}
					
			}
		}
		System.out.print(cnt + 1);
	}

}
/**
 다른 풀이 : 
 	1. arr[42] 배열을 만든다.
 	2. 들어오는 숫자들을 42로 나머지계산한다.
 	3. 해당 숫자를 인덱스로 취급하여 arr[나머지]++ 한다.
 	4. 마지막에 arr iter 하여 값이 존재하는 것들을 볼 때 마다 count한다.
 */
