package Interface;

import Abstract.AllEmployee;

public class Yoon extends AllEmployee implements Animal,Codable {
//�������̽��� �߻�޼����� ������ ����ȭ ��Ų��
//yoon�� Ŭ������ protected�� ����� �ٸ���Ű���� AllEmployee�� ������� ������ �����ִ�.
	@Override
	public void coding(String lang) {
System.out.println(lang+"�� �ڵ��� �� �ִ�.");		
	}

	@Override
	public void eat() {
		System.out.println("�䤡�´�");		
	}

	@Override
	public void sleep() {
		System.out.println("�ܴ�");		
	}//�������̽� �� �߻�޼����� ������ ����ȭ ��Ų��

	@Override
	public int getMoneyPay() {
		return pay/12;
	}
	
	//�������̽� ���� Ű����
	

}
