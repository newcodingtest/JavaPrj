
public class ex02method {

	public static void main(String[] args) {
		// 학생의 정보를 입력하여 출력하는 메소드 설계 
		// 학생의 정보: 이름 나이 학년

		studentInfo("yoon",24,4);
	}

	
	 public static void studentInfo(String name, int age, int grade) {
		 System.out.println("name: "+name);
		 System.out.println("age: "+age);
		 System.out.println("grade: "+grade);
	 }
}
