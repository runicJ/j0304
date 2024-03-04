package t1_memory;

public class Test3 {
	public static void main(String[] args) {
		String name1 = "홍길동";  // 똑같은 값 같은 주소값, 따로 저장x
		String name2 = "홍길동";
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");
	}
}
