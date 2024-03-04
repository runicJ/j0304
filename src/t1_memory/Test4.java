package t1_memory;

public class Test4 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동");  // Heap 영역에서 찾아보지 않음, 새로 주소 값을 넣음.
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");  // 스텍에서 비교(주소값이 다름)
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다.");  // 힙에 있는 값을 비교.
		else System.out.println("name1과 name2는 다릅니다.");
	}
}
