package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


import musicplayer.Music;

public class jdbc_main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		boolean isPlay=true;
		
		
		while(isPlay) {
		System.out.println("[1]��� [2]���� [3]������ [4]������ [5]���� :");
		int button = sc.nextInt();
		
		switch(button) {
		case 1: //���
	
			//try-catch��: ���α׷��� ����ó���� �����ϴ� ����
			//try��: ������ ����
			//catch��: try���� �ۼ��� ������ ���� �� ������ �߻����� �� �����ϴ� ����
			try {
				String ur1="jdbc:oracle:thin:@localhost:1521:xe"; //localhost�κ��� �������ּҷ� �ٲٸ� ������� db������ ���� ����
				String user="hr";
				String password="hr";
				//1. JDBC ����̹� �ε�(�����ε�)
				Class.forName("oracle.jdbc.driver.OracleDriver");//�� ������ ���������� �ش� ������ �ִ��� ������ Ȯ��
				
				//2. DB ����
				Connection conn=DriverManager.getConnection(ur1 , user, password);// �Ʊ� db Ŀ�ؼ��� propertise ����
				
				if(conn==null) {
					System.out.println("db���� ����");
				}else {
					System.out.println("db���� ����");
				}
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			break;
		case 2: //���� 
		
			break;
		case 3: //������
			
		
			break;
		case 4: // ������ 
			break;
		case 5:
			System.out.println("���α׷��� �����մϴ�");
			isPlay=false;
		default:
			
			
		}//switch
	}//while
}

}
