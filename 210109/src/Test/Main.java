package Test;

public class Main {

	public static void main(String[] args) {
		//다형성
		Doll doll=new Doll();
		//Doll-->상속받는 피카츄,파이리,꼬부기 클래스 만들기
		//Doll pick->오버라이팅->피카츄, 파이리, 꼬부기 인형
		// 인형뽑기 기계
		
		Machine mc=new Machine();
		//Pika pk=new Pika();
		//mc.start(pk);
		mc.start(new Pika());
		mc.start(new kobuk());
		
	}

}
