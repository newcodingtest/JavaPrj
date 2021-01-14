package OOP;

public class BankBook {
	
	int money;
	int bank;
	
	public int deposit(int money) {//돈을 넣는다
		this.money+=money;  //this는 class 값을 가져온다 ,그냥 money 는 파라미터값을가져온다
		return this.money;
	}
	
	public int withdraw(int money) {//돈을 인출한다
		
		if(this.money>money) {
	    this.money-=money;
		}else {
			System.out.println("재정이 부족합니다");
		}
		
        return this.money;
	}

	public void showMoney() {//잔액을 보여준다
	  System.out.println(money);
}

}
