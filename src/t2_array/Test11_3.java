package t2_array;

// 2차원 배열(불규칙 값 저장)
/*
 		100 90 80 50
 		 80	50 
 		 90 10 20 90
 		100 10 20 
 */
public class Test11_3 {
	public static void main(String[] args) {
		int[][] atom = 
			{
				{100,90,80,50},
				{80,50},  //null 값이 아니라 그냥 아예 비워 있는 것
				{90,10,20,90},
				{100,10,20}
			};
		
		// 배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<atom.length; i++) {  //배열명.length는 행의 크기가 된다
			for(int j=0; j<atom[i].length; j++) {  //행이름.length 열의 크기
				System.out.print(atom[i][j] + "\t");
			}
			System.out.println();
		}
		// System.out.println(atom[1][2]);
	}
}
