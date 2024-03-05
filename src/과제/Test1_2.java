package 과제;

public class Test1_2 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int a = i / 10;
			int b = i % 10;
			
			if(a == 3 || a == 6 || a == 9) {
				if(b == 3 || b == 6 || b == 9) System.out.print("짝짝" + "\t");
				else System.out.print("짝" + "\t");
			}
			else System.out.print(i + "\t");
			
			if(i % 10 == 0) System.out.println();
		}
	}
}
