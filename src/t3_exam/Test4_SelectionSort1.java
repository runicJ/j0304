package t3_exam;

public class Test4_SelectionSort1 {
	public static void main(String[] args) {
		//int[] m = new int[6];
		//int[] m = new int[] {};
		int[]	m = {5,2,6,8,4,7};
		int temp = 0;
		
		System.out.print("원본자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
			
		for(int i=1; i<=5; i++) {
			for(int j=i+1; j<=6; j++) {
				if(m[i-1] > m[j-1]) {  // < 내림차순
					temp = m[i-1];
					m[i-1] = m[j-1];
					m[j-1] = temp;
				}
			}
		}
		
		System.out.print("정렬자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}
}
