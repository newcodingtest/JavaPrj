package OOP;

public class STUDENT {
  
	//접근 제한자: private, public default protected
	private String name;
	private String number;
	private int age;
	private int scoreWeb;
	private int scoreAndroid;
	private int scorejava;
	
	 //생성자는 리턴타입이 필요없음
	// 생성자의 특징
	// 1)리턴타입을 지정할수 없음(void도 아님)
	// 2)클래스의 이름과 생성자 명은 동일해야한다
	// 3)생성자를 새롭게 선언하는 순간 디폴트 생성자가 덮어 씌어진다.
	// 4)생성자로 오버로딩이 가능하다(중복정의)
//	public STUDENT() { //기본생성자
		
//	}
	public STUDENT(String name,String number,int age) {
		
		this.name=name;
		this.number=number;
		this.age=age;
		
		
	}     
	
			 
    //필드를 private를 안하면 메서드들이 직접적으로
	//다 필드에 접근할려고 하기때문에 메서드간의 의존성주입이 일어나게된다(나쁜개발)
			 
	
	//각각의 점수들을 입력할 수 있는 메소드 만들자
	 public void setScoreJava(int scoreJava) {
		 if(scoreJava <= 100) {
			 this.scorejava=scoreJava;;
		 }else {
			 System.out.println("잘못된 점수를 입력하셨습니다");
			 }
		 }
		 
	//안드로이드, 웹점수를 입력할 수 있는 메소드 만들기
	 public void setScoreWeb(int scoreWeb) {
		 if(scoreWeb <= 100) {
			 this.scoreWeb=scoreWeb;
		 }else{
			 System.out.println("잘못된 점수를 입력하셨습니다");
			 }
	 }
	 
	 public void setScoreAndroid(int scoreAndroid) {
		 if(scoreAndroid <= 100) {
			 this.scoreAndroid=scoreAndroid;
		 }else {
			 System.out.println("잘못된 점수를 입력하셨습니다");
			 }
	 }
	 
	 //필드 값을 가지고 갈 수 있는 메소드 생성
	 public int getScoreJava() {
		 return scorejava;
	 }
	 
	 public int getScoreWeb() {
		 return scoreWeb;
	 }
	 
	 public int getScoreAndroid() {
		 return scoreAndroid;
	 }
	 
   
   public void show() {
	   System.out.println(name+"님 안녕?");
	   System.out.println("["+number+" , "+age+"sal"+"]");
	   System.out.println(name+"님의 java점수는"+scorejava +"입니다");
	   System.out.println(name+"님의 web점수는"+scoreWeb +"입니다");
	   System.out.println(name+"님의 android점수는"+scoreAndroid +"입니다");
	   System.out.println(name+"님의 java점수는"+scorejava +"입니다");
	   System.out.println("======================================");
   }
}
