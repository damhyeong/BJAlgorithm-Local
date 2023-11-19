package pack22_백트래킹;

import java.util.*;
import java.io.*;

/**
N-Queen
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
10 초	128 MB	96931	46579	30239	46.782%
문제
N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.

N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (1 ≤ N < 15)

출력
첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.

예제 입력 1 
8
예제 출력 1 
92

초점 : 수직, 수평, 정대각선으로 마주칠 수 없음.
	* 수직, 수평은 for문 재귀로 해결할 수 있음. 하지만, 대각선을 해결하기는 어렵다.
	* 따라서, 이는 N * N의 boolean 배열을 만들어 갈 수 없는 곳을 1로 표현하면 될 것 같다. 
 */

public class Exam_9663 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		boolean[][] doNotPlace = new boolean[N][N];
		
		ChessBoard cb = new ChessBoard(N, 0, doNotPlace);
		
		cb.getNumQueen(0, cb.doNotPlace);
		bw.write(Integer.toString(cb.getCount()));
		bw.flush();
		bw.close();
		br.close();
	}
}

class ChessBoard{
	public int cnt = 0;
	public int N;
	public int deep;
	public boolean[][] doNotPlace;
	public boolean[][] backUp;
	
	public ChessBoard(int N, int deep, boolean[][] doNotPlace) {
		this.N = N;
		this.deep = deep;
		this.doNotPlace = doNotPlace;
	}
	
	public int getCount() {
		return this.cnt;
	}
	public void getNumQueen(int deep, boolean[][] doNotPlace){
		/*
		if(deep == N) {
			cnt++;
			return;
		}
		*/
		for(int i = 0; i < N; i++) {
			//boolean[][] notPlace = doNotPlace.clone();
			if(doNotPlace[deep][i])
				continue;
			else {
				if(deep == N - 1) {
					cnt++;
					continue;
				}
				//boolean[][] notPlace = copyChessBoard(doNotPlace);
				boolean[][] notPlace = new boolean[N][N];
				for(int j = 0; j < N; j++) {
					System.arraycopy(doNotPlace[j], 0, notPlace[j], 0, N);
				}
				for(int j = 0; j < N; j++) {
					notPlace[deep][j] = true;
					notPlace[j][i] = true;
				}
				this.checkCross(notPlace, deep, i);
				
				this.getNumQueen(deep + 1, notPlace);
			}
		}
	}
	/*
	public boolean[][] copyChessBoard(boolean[][] board) {
		boolean[][] newChess = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			System.arraycopy(board[i], 0, newChess[i], 0, N);
		}
		return newChess;
	}
	*/
	
	public void checkCross(boolean[][] board, int i, int j) {
		for(int x = i, y = j; x >= 0 && y >= 0; x--, y --) {
			board[x][y] = true;
		}
		for(int x = i, y = j; x < N && y < N; x++, y++) {
			board[x][y] = true;
		}
		for(int x = i, y = j; x < N && y >= 0; x++, y--) {
			board[x][y] = true;
		}
		for(int x = i, y = j; x >= 0 && y < N; x--, y++) {
			board[x][y] = true;
		}
	}
}
