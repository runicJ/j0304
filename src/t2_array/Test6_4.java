package t2_array;

import java.util.Date;
import java.util.Scanner;

//Ctrl + Shift + 'O' import 단축키
public class Test6_4 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println("now : " + now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";  //기본값 null 방지
		
		System.out.print("계속 할까요?(Yes/No) ");
		yn = sc.next();  //문자를 받음.
		System.out.println("입력된 문자 : " + yn);
		
		for(int i=0; i<yn.length(); i++) {
			if(yn.charAt(i) == 'Y') System.out.println("입력된 문자 중 Y가 있습니다.");  //char 정수형 기본타입 '=='비교(.equals가 아님-문자열)
			else System.out.println("입력된 문자 중 Y가 없습니다~~~~");
		}
		
		sc.close();
	}
}
