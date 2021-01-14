package Inherence;

public class MapleMain{
	
	public static void main(String[] args) {
	//
	Maple dodo=new Maple(100,100,"기본캐릭터"); //부모클래스
	dodo.go();
	dodo.attack();
	
	
	Dodo hyper=new Dodo(200,100,"카이저"); //자식클래스
	hyper.attack(); //상속을 받으면 부모클래스가 가지고 있는 기능들을 전부 사용할 수 있다.
	hyper.skill();

		
	}
		
}


