package OOP;



public class Main {

	public static void main(String[] args) {
         
		//People ���赵�� ������� ��ü�� ����
		//Ŭ������ �ν��Ͻ�ȭ(��üȭ)
		People yoon=new People();
		//yoon->�ּҰ��� �����ִ� ���۷��� ����
		System.out.println(yoon);
		//��üȭ �Ϸ�! ->�ʵ��� ���� �� ����ִ»���
		System.out.println("yoon's age: "+yoon.age);
		
		yoon.age=26;
		System.out.println("yoon's age: "+yoon.age);
		yoon.name="¯��";
		yoon.sex='��';
		yoon.number=123456789;
		yoon.weight=85.2f;
		System.out.println("age: "+yoon.name);
		System.out.println("sex: "+yoon.sex);
		System.out.println("weight: "+yoon.weight);
		System.out.println("number: "+yoon.number);
		
		
		//���ڴ� �޼��� ����ϱ�
		yoon.sleep();
		yoon.weight=yoon.eat(5);
		System.out.println(yoon.weight);
		yoon.walk();
	
		
		
		People daehee=new People();
		System.out.println(d);
		
		
		
	}

}
