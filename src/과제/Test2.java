package 과제;

import java.util.Scanner;

/*
(2번) 가위/바위/보 게임
컴퓨터에게 랜덤하게 '가위/바위/보'중의 하나를 기억시켜놓고, 사용자가 '가위/바위/보'중에서 하나를 입력하면, 
누가 이겼는지를 출력처리한다.(단, '그만'을 입력하면 프로그램을 종료처리한다)
*/
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int me = 0, com = 0;
		
		int[]	su = {0, 1, 2};
		String[] title = {"가위", "바위", "보"};
		me = sc.nextInt();
		com = (int) Math.random();
		
		
	}
}
