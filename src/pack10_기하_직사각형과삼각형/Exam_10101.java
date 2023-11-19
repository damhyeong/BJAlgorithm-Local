package pack10_기하_직사각형과삼각형;

import java.util.*;
import java.io.*;

/**
문제
창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.

삼각형의 세 각을 입력받은 다음, 

세 각의 크기가 모두 60이면, Equilateral
세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
세 각의 합이 180이 아닌 경우에는 Error
를 출력하는 프로그램을 작성하시오.

입력
총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 모든 정수는 0보다 크고, 180보다 작다.

출력
문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.

예제 입력 1 
60
70
50
예제 출력 1 
Scalene
 */

public class Exam_10101 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] degree = new int[3];
		
		degree[0] = Integer.parseInt(br.readLine());
		degree[1] = Integer.parseInt(br.readLine());
		degree[2] = Integer.parseInt(br.readLine());
		
		int sum = degree[0] + degree[1] + degree[2];
		
		if(degree[0] == 60 && degree[1] == 60 && degree[2] == 60)
			System.out.println("Equilateral");
		else if (sum == 180 && (degree[0] == degree[1] || degree[1] == degree[2] || degree[0] == degree[2]))
			System.out.println("Isosceles");
		else if (sum == 180)
			System.out.println("Scalene");
		else {
			System.out.println("Error");
		}
	}

}
