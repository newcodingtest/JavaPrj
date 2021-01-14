package jdbc;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import musicplayer.Music;

public class jdbc_main2 {

	static Connection conn=null;  //DB�� �����ϱ����� ��ü �������̽�. �޼��忡�� ��� ������ ���⶧���� static ���������� �����Ͽ� ����
	static PreparedStatement pst=null; //DB�� �ڹٰ��� ��� ��ο���
	static ResultSet rs=null; //select ���� ����� �� �ʿ�
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		boolean isPlay=true;
	
		//DB�� ���õ� ��ɵ��� �����ϴ� dao ��ü ����
		memberDAO dao=new memberDAO();
		
		while(isPlay) {
		System.out.println("[1]ȸ����� [2]ȸ������ [3]ȸ����ȸ [4]ȸ������ [5]���� :");
		int button = sc.nextInt();
		
		switch(button) {
		case 1: //ȸ�� ��� 
			System.out.print("�̸�: ");
			String name=sc.next();
			System.out.print("����: ");
			int age=sc.nextInt();
            System.out.print("����: ");
			String gender=sc.next();
			//try-catch��: ���α׷��� ����ó���� �����ϴ� ����
			//try��: ������ ����
			//catch��: try���� �ۼ��� ������ ���� �� ������ �߻����� �� �����ϴ� ����
			dao.insertMember(name, age, gender);
			break;
			
		case 2: //ȸ������(���̸�)
			System.out.println("���̸� ������ ����� �Է����ּ���");
			name=sc.next();
			System.out.println("���̸� �����ϰڽ��ϴ�");
		    age=sc.nextInt();
		    dao.updateMember(name, age);
			break;
			
		case 3: //ȸ����ȸ
			ArrayList<MemberVO> members=dao.selectmemberall();
			for (int i = 0; i < members.size(); i++) {
//				System.out.println(members.get(i));
				System.out.print("�̸�: "+members.get(i).getName()+" ");
				System.out.print("����: "+members.get(i).getAge()+" ");
				System.out.print("����: " +members.get(i).getGender() + " ");
				System.out.println();
				
			}
			break;
		case 4: // ȸ������
			System.out.println("������ ȸ���� �̸��� �Է����ּ���");
			name=sc.next();
			dao.deletemember(name);
			break;
			
		case 5: //ȸ�� �ý��� ����
			System.out.println("���α׷��� �����մϴ�");
			isPlay=false;
		default:
		}//switch
	}//while
}

	
}
