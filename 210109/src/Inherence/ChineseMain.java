package Inherence;

public class ChineseMain {

	public static void main(String[] args) {

		Parent pr=new Parent();
		
		Child cd=new Child();
		
		//업캐스팅(UpCasting)-->암묵적 형변환
		//Parent가 필요한 메소드와 필드를 Child가 전부 가지고 있기 때문에
		//래퍼런스 변수는 부모= 몸체 자식
		Parent pr2=new Child();
		
		
		pr.tangsu6();
		cd.tangsu6();
		pr.jjajang();
		cd.jjajang();
		
		//몸체를 Child 를 만들어줬기 때문에 Child가 가진 jjajang기능 사용
		pr2.jjajang();
		//pr2.bbok();//이건 불가능-->부모가 가지고있는 기능이 아니기 때문에
		
		// 2. 다운캐스팅
		// 사전조건 : 업캐스팅 된 객체를 대상으로만 다운캐스팅 진행
		//Child cd2=(Child)new Parent(); //-->컴파일시 에러뜬다. Child에 Parent에 없는 bbok() 메서드가 있기때문에 변환x
		Child cd2=(Child)pr2;
		cd2.bbok();
		
		
	}

}
