package Inherence;



public class Maple { //부모클래스
    
	
	//슈퍼클래스,부모클래스
	
	// 1. 필드
	// HP, MP, name

	private int hp;
	private int mp;
	private String name;
	
	// 2. 생성자
	// 위의 세 개의 필드를 전부 채워주기
	
	public Maple(int hp, int mp, String name) { //alt+shift+s
		super();
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}
	

	// 3. 메소드
	// 앞으로 가기, 뒤로가기, 점프하기, 공격하기
	public void go() {
		System.out.println(name+" 앞으로 간다");
	}
	
	public void back() {
		System.out.println(name+" 뒤로간다");
	}
	
	public void jump() {
		System.out.println(name+" 점프점프!");
	}
	
	public void attack() {
		System.out.println(name+" 공격하기!!");
	}
	
	public void show() {
	System.out.println("현재HP"+hp);
	System.out.println("현재MP"+mp);
	System.out.println("이름"+name);
	}
}
