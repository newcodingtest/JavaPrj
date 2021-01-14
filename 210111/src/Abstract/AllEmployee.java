package Abstract;

public abstract class AllEmployee {
	
	//1. 공통된 필드들 추상화
	protected String empno;
	protected String name;
	protected int pay;

	//2. 공통된 메소드
	// 월급계산 메소드--->추상메소드
	public abstract int getMoneyPay();
	
	//print()
	public  String print() {
		return empno+name+pay;
	};
	}


