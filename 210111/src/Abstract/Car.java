package Abstract;

public abstract class Car {

	//추상클ㄹ스란?
	// 1. 추상메소드를 가지고 있는 메소드를 추상메소드
	// 2. abstract 키워드를 사용하고 있ㄴㄴ 클래스를 추상클래스
	// 3. 몸체를 가진 메소드를 만들 수 있다.
	
	//키워드는? abstract
	// 바퀴, 엔진 필드생성
    protected int wheel;
    protected String engine;
    
	
	public Car(int wheel, String engine) {
		super();
		this.wheel = wheel;
		this.engine = engine;
	}

	//앞으로가기, 뒤로가기, 엑셀 메소드 생성
    public abstract void go(); //body{}가 없는 메소드--> 추상메소드
    	
    //back, accel
    public abstract void back();
    public abstract void accel();
    
    public void print() {
    	System.out.println("휠의 개수는 "+wheel+"개");
    	System.out.println("엔진은"+engine);
    }
}
