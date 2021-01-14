package OOP;



public class Main {

	public static void main(String[] args) {
         
		//People 설계도를 기반으로 객체를 생성
		//클래스의 인스턴스화(실체화)
		People yoon=new People();
		//yoon->주소값을 갖고있는 레퍼런스 변수
		System.out.println(yoon);
		//실체화 완료! ->필드의 값은 다 비어있는상태
		System.out.println("yoon's age: "+yoon.age);
		
		yoon.age=26;
		System.out.println("yoon's age: "+yoon.age);
		yoon.name="짱구";
		yoon.sex='남';
		yoon.number=123456789;
		yoon.weight=85.2f;
		System.out.println("age: "+yoon.name);
		System.out.println("sex: "+yoon.sex);
		System.out.println("weight: "+yoon.weight);
		System.out.println("number: "+yoon.number);
		
		
		//잠자는 메서드 사용하기
		yoon.sleep();
		yoon.weight=yoon.eat(5);
		System.out.println(yoon.weight);
		yoon.walk();
	
		
		
		People daehee=new People();
		System.out.println(d);
		
		
		
	}

}
