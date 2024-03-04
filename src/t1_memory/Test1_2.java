package t1_memory;

import java.util.Scanner;

public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int ans = 0;  // 1:계속, 0:그만
		int cnt = 0;  // =은 값을 비교(기본 타입일때 값, 참조 타입일때 주소(값))
		String ans = "N";  // 참조 타입(기본x)
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속할까요?(Y:계속, N:그만) ");
			ans = sc.next();  // 단순히 입력(하나만 받음)  // 여러개 입력 nextLine()
			if(ans == "N") break;  // 변수.equals 객체 비교 연산자 = 주소(번지)에 가서 값을 비교
		}
		System.out.println("작업끝...");
		
		sc.close();
	}
}
