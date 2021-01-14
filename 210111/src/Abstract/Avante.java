package Abstract;

public class Avante extends Car {

	public Avante(int wheel, String engine) {
		super(wheel, engine);  //부모가 가지고 있는 생성자
	}

	
	//추상메소드 구현하도록 강제화
	@Override
	public void go() {
		System.out.println("앞으로전진");
	}

	@Override
	public void back() {
    System.out.println("뒤로후진");		
	}

	@Override
	public void accel() {
     System.out.println("엑셀 드리프트~");		
	}

}
