package OOP;

//클래스이름:대문자
//메서드이름:소문자
public class People {
	
	//사람이라고 하는 객체를 만들기 위한 설계도면
	//1. 필드(속성,특성,데이터)
	//다리
	//주민등록번호, 성별, 나이, 몸무게, 이름
    int number;
    char sex;
    int age;
    float weight;
    String name;
    int leg=3;

	// 2, 메서드(기능, 행위, 행동)
	// 이족보행. 운동하다. 숨쉬다. 밥먹다. 잠잔다
	// 접근제한자-4가지
    public void walk() {
    	
    	System.out.println(leg+"개의 다리로 걷는다.");
    }
    
    public float exercise(int move) {
    	return weight-move;
    }
    
    public void breathe() {
    	System.out.println("hoo~!hoo~!");
    }
    
    public float eat(int weight) {
    	//this->현재 클래스(메서드의 파라미터값을 의미) 그 자체를 의미
    	return this.weight+weight;
    }
    
    public void sleep() {
    	System.out.println("sleeping~ zzZZ");
    }

}
