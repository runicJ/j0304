package 과제;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어 단어를 입력하세요? ");
		String word = sc.next();
		
		String[][] pro = 
			{
					{"love", "사랑"},
					{"java", "자바"},
					{"hope", "희망"}
			};
		for(int i=0; i<pro.length; i++) {
			for(int j=0; j<pro[i].length; j++)
				if(pro[i][j].equals(word)) System.out.println(pro[i][j+1]);
				else System.out.println("사전에 없는 단어 입니다...");
		}
	}
}
