package Inherence;

public class Dodo extends Maple {//Maple의 자식클래스
	
	//Maple 슈퍼클래스를 상속받는 서브클래스/자식클래스
	//extends
			
	// 부모클래스가 디폴트생성자가 아닌 다른 생성자를 갖는다면
	// 반드시 그 생성자를 만들어줘야한다.
	public Dodo(int hp, int mp, String name) {
		super(hp, mp, name);  //부모클래스도 정보를 보내고있음
	}

	public void skill() {
		System.out.println("엑스칼리버!!!");
	}

	//메소드 오버라이딩 --->재정의
	//attack()--->오버라이딩
	@Override //어노테이션
	public void attack() {
		System.out.println("필살기를 시전한다!");
		
	}
		
		

	}

