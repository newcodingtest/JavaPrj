package Test;

public class Main {

	public static void main(String[] args) {
		//������
		Doll doll=new Doll();
		//Doll-->��ӹ޴� ��ī��,���̸�,���α� Ŭ���� �����
		//Doll pick->����������->��ī��, ���̸�, ���α� ����
		// �����̱� ���
		
		Machine mc=new Machine();
		//Pika pk=new Pika();
		//mc.start(pk);
		mc.start(new Pika());
		mc.start(new kobuk());
		
	}

}
