package t3_exam;

// 배열을 이용한 369게임
/*
(1번) 3,6,9 게임
1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오.(한줄에 10개씩 출력하시오)
예) 1 2 짝 4 5 짝 7 ~~~~~ 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 41 42 짝 44 ~~~
*/
public class Test2_369게임 {
	public static void main(String[] args) {
		// Integer.toString(0) // wrapper class 감싸서 다른 작업 // int->Integer double->Double 대문자
		String[] num = new String[100];  // num[]도 가능
		int sw;  // boolean 가능
		String temp;  // 누적하는 변수
		
		// num[]배열에 3,6,9 대신에 '짝'문자열을 저장
		for(int i=0; i<num.length; i++) {
			num[i] = (i + 1) + "";  // 문자 + 숫자 = 문자 // toString과 똑같은 역할
			temp = "";  // 누적할 것 초기값 부여
			sw = 0;
			
			for(int j=0; j<num[i].length(); j++) {
				if(num[i].charAt(j)=='3' || num[i].charAt(j)=='6' || num[i].charAt(j)=='9') {
					temp += "짝";
					sw = 1;
				}
			}
			if(sw == 1) num[i] = temp;
		}
		
		// num[]배열에 저장된 값을 10개씩 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
			if((i+1) % 10 == 0) System.out.println();
		}
	}
}
