package OOP;

public class BankBook {
	
	int money;
	int bank;
	
	public int deposit(int money) {//���� �ִ´�
		this.money+=money;  //this�� class ���� �����´� ,�׳� money �� �Ķ���Ͱ��������´�
		return this.money;
	}
	
	public int withdraw(int money) {//���� �����Ѵ�
		
		if(this.money>money) {
	    this.money-=money;
		}else {
			System.out.println("������ �����մϴ�");
		}
		
        return this.money;
	}

	public void showMoney() {//�ܾ��� �����ش�
	  System.out.println(money);
}

}
