package Abstract;

public class Avante extends Car {

	public Avante(int wheel, String engine) {
		super(wheel, engine);  //�θ� ������ �ִ� ������
	}

	
	//�߻�޼ҵ� �����ϵ��� ����ȭ
	@Override
	public void go() {
		System.out.println("����������");
	}

	@Override
	public void back() {
    System.out.println("�ڷ�����");		
	}

	@Override
	public void accel() {
     System.out.println("���� �帮��Ʈ~");		
	}

}
