package Inherence;

public class ChineseMain {

	public static void main(String[] args) {

		Parent pr=new Parent();
		
		Child cd=new Child();
		
		//��ĳ����(UpCasting)-->�Ϲ��� ����ȯ
		//Parent�� �ʿ��� �޼ҵ�� �ʵ带 Child�� ���� ������ �ֱ� ������
		//���۷��� ������ �θ�= ��ü �ڽ�
		Parent pr2=new Child();
		
		
		pr.tangsu6();
		cd.tangsu6();
		pr.jjajang();
		cd.jjajang();
		
		//��ü�� Child �� �������� ������ Child�� ���� jjajang��� ���
		pr2.jjajang();
		//pr2.bbok();//�̰� �Ұ���-->�θ� �������ִ� ����� �ƴϱ� ������
		
		// 2. �ٿ�ĳ����
		// �������� : ��ĳ���� �� ��ü�� ������θ� �ٿ�ĳ���� ����
		//Child cd2=(Child)new Parent(); //-->�����Ͻ� �������. Child�� Parent�� ���� bbok() �޼��尡 �ֱ⶧���� ��ȯx
		Child cd2=(Child)pr2;
		cd2.bbok();
		
		
	}

}
