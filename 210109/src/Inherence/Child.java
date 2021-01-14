package Inherence;

public class Child extends Parent { //자식은 3가지의 기능을 쓸쑤있다. why? 재정의한 짜장면 기능을 쓰지 부모의 짜장기능은 못쓴다

	public void bbok() {
		System.out.println("볶음밥을 만든다");
	}

	@Override
	public void jjajang() {
		//부모클래스를 의미하는 키워드이다
		System.out.println("돼지고기를 듬뿍넣은 업그레이드 짜장면을 만든다");
	}
	
	
}
