package OOP;

public class Main {

	public static void main(String[] args) {
		//STUDENT student1=new STUDENT();
		//위가 에러가 뜨는 이유는 기본 생성자가 덮어씌워졌기 때문에
		 STUDENT student1=new STUDENT("윤주영","20150481",26);
		 student1.show();
		 
		 
		//점수를 입력
		//직접적으로 필드에 접근을 할 수가 없다
		//입력할 수 있는 메소드 생성
		 student1.setScoreJava(100);
		 student1.setScoreAndroid(98);
		 student1.setScoreWeb(99);
		 student1.show();
		
		System.out.println("=======");
		
		 //자바점수만 가지고 와서 특z정 작업을 하고싶다면?
		 //가지고 오는 것도 메소드로 생성
		 System.out.println(student1.getScoreAndroid());
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 student1.name="윤주영";
//		 student1.number="20200878";
//		 student1.age=26;
//		 student1.scorejava=50;
//		 student1.scoreWeb=99;
//		 student1.scoreAndroid=77;
		 
//		 student2.name="김미희";
//		 student2.number="20200458";
//		 student2.age=20;
//		 student2.scorejava=90;
//		 student2.scoreWeb=25;
//		 student2.scoreAndroid=50;
		 
//		 student1.show();
//		 student2.show();

	}

}
