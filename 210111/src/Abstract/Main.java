package Abstract;

public class Main {

	public static void main(String[] args) {

		//추상클래스는 인스턴스화 시킬 수 없다-->익명클래스 검색해보기!!
		//Car car=new Car() 
		
		Avante avante=new Avante(4,"엔진");
		avante.print();
		avante.accel();
			
		
	}

}
