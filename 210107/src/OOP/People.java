package OOP;

//Ŭ�����̸�:�빮��
//�޼����̸�:�ҹ���
public class People {
	
	//����̶�� �ϴ� ��ü�� ����� ���� ���赵��
	//1. �ʵ�(�Ӽ�,Ư��,������)
	//�ٸ�
	//�ֹε�Ϲ�ȣ, ����, ����, ������, �̸�
    int number;
    char sex;
    int age;
    float weight;
    String name;
    int leg=3;

	// 2, �޼���(���, ����, �ൿ)
	// ��������. ��ϴ�. ������. ��Դ�. ���ܴ�
	// ����������-4����
    public void walk() {
    	
    	System.out.println(leg+"���� �ٸ��� �ȴ´�.");
    }
    
    public float exercise(int move) {
    	return weight-move;
    }
    
    public void breathe() {
    	System.out.println("hoo~!hoo~!");
    }
    
    public float eat(int weight) {
    	//this->���� Ŭ����(�޼����� �Ķ���Ͱ��� �ǹ�) �� ��ü�� �ǹ�
    	return this.weight+weight;
    }
    
    public void sleep() {
    	System.out.println("sleeping~ zzZZ");
    }

}
