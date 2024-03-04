package t2_array;

// 2차원 배열
public class Test7 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4];  // 행, 열
		
		for(int i=0; i<4; i++) {
			System.out.print(atom[0][i] + " / ");  // 1행만 출력
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			System.out.print(atom[1][i] + " / ");  // 2행만 출력
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			System.out.print(atom[2][i] + " / ");  // 3행만 출력
		}
		System.out.println();
		System.out.println("===========================");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(atom[i][j] + " / ");
			}
			System.out.println();
		}
	}
}
