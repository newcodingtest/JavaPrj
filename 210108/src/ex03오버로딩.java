
public class ex03오버로딩 {

	public static void main(String[] args) {
		
		//메소드 오버로딩
		// -메소드의 이름은 동일
		// -매개변수의 타입 또는 개수를 다르게 정의하는 기법
		
		addNumber(2,2);
		addNumber(2,2,3);
		
		addNumber(2,3.5);
		
		
		
	}

	//////////////////////////////////////////////////
	private static void addNumber(int i, int j) {
		System.out.println(i+j);
	}
	//////////////////////////////////////////////////
	private static void addNumber(int i, int j, int k) {
		System.out.println(i+j+k);
	}
//////////////////////////////////////////////////
	private static void addNumber(int i, double j) {
		System.out.println(i+j);
	}
	

}
