package t2_array;

import java.util.Arrays;

public class Test6_2 {
	public static void main(String[] args) {
		char[] strArray = {'k','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray);
		System.out.println("==========================");
		
		System.out.println("strArray의 길이 : " + strArray.length);
		System.out.println();
		
		System.out.println("strArray을 문자열로 변환 : " + Arrays.toString(strArray));  // 배열을 문자열로 바꿈(변환메서드)
		System.out.println();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray["+i+"] = " + strArray[i]);
		}
		System.out.println();
		
		String str = "Korea";
		// 현재 문자열 중에서 특정 인덱스에 위치한 문자를 반환? charAt()  //문자열을 문자 배열처럼(배열x) 한개씩 꺼낸다.  //length 메소드
		for(int i=0; i<str.length(); i++) {
			System.out.println("str("+i+") = " + str.charAt(i));
		}
	}
}
