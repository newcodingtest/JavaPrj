package Interface;

import Abstract.AllEmployee;

public class Yoon extends AllEmployee implements Animal,Codable {
//인터페이스는 추상메서드의 구현을 강제화 시킨다
//yoon의 클래스는 protected로 선언된 다른패키기의 AllEmployee을 상속으로 가져와 쓸수있다.
	@Override
	public void coding(String lang) {
System.out.println(lang+"언어를 코딩할 수 있다.");		
	}

	@Override
	public void eat() {
		System.out.println("밥ㄱ는다");		
	}

	@Override
	public void sleep() {
		System.out.println("잔다");		
	}//인터페이스 는 추상메서드의 구현을 강제화 시킨다

	@Override
	public int getMoneyPay() {
		return pay/12;
	}
	
	//인터페이스 구현 키워드
	

}
