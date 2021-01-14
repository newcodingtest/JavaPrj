package Abstract;

public abstract class Car {

	//�߻�Ŭ������?
	// 1. �߻�޼ҵ带 ������ �ִ� �޼ҵ带 �߻�޼ҵ�
	// 2. abstract Ű���带 ����ϰ� �֤��� Ŭ������ �߻�Ŭ����
	// 3. ��ü�� ���� �޼ҵ带 ���� �� �ִ�.
	
	//Ű�����? abstract
	// ����, ���� �ʵ����
    protected int wheel;
    protected String engine;
    
	
	public Car(int wheel, String engine) {
		super();
		this.wheel = wheel;
		this.engine = engine;
	}

	//�����ΰ���, �ڷΰ���, ���� �޼ҵ� ����
    public abstract void go(); //body{}�� ���� �޼ҵ�--> �߻�޼ҵ�
    	
    //back, accel
    public abstract void back();
    public abstract void accel();
    
    public void print() {
    	System.out.println("���� ������ "+wheel+"��");
    	System.out.println("������"+engine);
    }
}
