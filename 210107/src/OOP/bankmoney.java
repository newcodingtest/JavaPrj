package OOP;

public class bankmoney {

	public static void main(String[] args) {

		BankBook mn=new BankBook();
		System.out.print("���� ��������: ");
		mn.money=3000;
		
		System.out.println(mn.money); //3000
		
		System.out.print("2000���� ���忡 save�Ҳ�yo");
		mn.deposit(2000);
		
	
		System.out.print("\n���� ��������: ");
		mn.showMoney(); //4000
	    
	    System.out.print(mn.withdraw(5000)+"���� ���忡 sub�Ҳ���");
	    
		mn.withdraw(5000);  //-2000
		mn.showMoney();    //result=2000
		
		
	
	}

}
