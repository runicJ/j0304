package 과제;

import java.util.Scanner;

// 년도와 달을 입력하면 해당년도 월의 마지막 일자를 출력하는 프로그램을 완선하시오...2024 2 29
// 윤년? 1.4로 나눠떨어지면 윤년? 2.이때 100으로 나눠떨어지면 평년? 3.이 년도가 400으로 나눠떠러지면 윤년이다.
public class Leap_Year2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {1,3,5,7,8,11};
		int[] b = {2,4,6,9,10,12};
		
		System.out.print("년도를 입력하세요? ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요? ");
		int mon = sc.nextInt();
		
		if(mon == 2) {
			if((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0))
				System.out.println(year + "년도 "+mon+"월의 마지막 일자는 29일 입니다.");
			else
				System.out.println(year + "년도 "+mon+"월의 마지막 일자는 28일 입니다.");
		}
		else if(mon >= 1 && mon <= 12) {
			for(int i=0; i<6; i++) {
				if(a[i] == mon)
					System.out.println(year + "년도 "+mon+"월의 마지막 일자는 31일 입니다.");
				else if(b[i] == mon)
					System.out.println(year + "년도 "+mon+"월의 마지막 일자는 30일 입니다.");
			}
		}
		else System.out.println("1월~12월까지만 입력 받을 수 있습니다.");
		
		sc.close();
	}
}