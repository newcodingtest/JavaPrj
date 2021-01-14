package OOP;

public class bankmoney {

	public static void main(String[] args) {

		BankBook mn=new BankBook();
		System.out.print("현재 재정상태: ");
		mn.money=3000;
		
		System.out.println(mn.money); //3000
		
		System.out.print("2000원을 통장에 save할꼐yo");
		mn.deposit(2000);
		
	
		System.out.print("\n현재 재정상태: ");
		mn.showMoney(); //4000
	    
	    System.out.print(mn.withdraw(5000)+"원을 통장에 sub할꼐여");
	    
		mn.withdraw(5000);  //-2000
		mn.showMoney();    //result=2000
		
		
	
	}

}
