package pack13_정렬;

import java.util.*;
import java.io.*;

/**
예제 입력 1 
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
예제 출력 1 
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate

문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
단, 중복된 단어는 하나만 남기고 제거해야 한다.

입력
첫째 줄에 단어의 개수 N이 주어진다. 
(1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다.

 */

public class Exam_1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		LinkedHashSet<String> str = new LinkedHashSet<>();
		
		for(int i = 0; i < N; i++) {
			str.add(br.readLine());
		}
		
		String[] newStr = new String[str.size()];
		
		Iterator iter = str.iterator();
		int k = 0;
		
		while(iter.hasNext()) {
			newStr[k] = (String) iter.next();
			k++;
		}
		
		
		Arrays.sort(newStr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				 if(s1.length() == s2.length())
					 return s1.compareTo(s2);
				 else
					 return s1.length() - s2.length();
			}
		});
		
		
		for(int i = 0; i < k; i++) {
			bw.write(newStr[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
