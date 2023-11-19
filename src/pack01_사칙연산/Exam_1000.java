package pack01_사칙연산;

import java.util.*;
import java.io.*;

public class Exam_1000 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.printf("%d", (a + b));
	}

}
