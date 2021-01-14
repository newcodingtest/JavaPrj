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
		System.out.println("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 :");
		int button = sc.nextInt();
		
		switch(button) {
		case 1: //재생
	
			//try-catch문: 프로그램의 예외처리를 실행하는 구문
			//try문: 실핼할 로직
			//catch문: try문에 작성된 로직이 실행 중 오류가 발생했을 때 동작하는 구문
			try {
				String ur1="jdbc:oracle:thin:@localhost:1521:xe"; //localhost부분을 아이피주소로 바꾸면 팀원모두 db서버에 접근 가능
				String user="hr";
				String password="hr";
				//1. JDBC 드라이버 로딩(동적로딩)
				Class.forName("oracle.jdbc.driver.OracleDriver");//이 구문을 실행했을때 해당 파일이 있는지 없는지 확인
				
				//2. DB 연결
				Connection conn=DriverManager.getConnection(ur1 , user, password);// 아까 db 커넥션의 propertise 정보
				
				if(conn==null) {
					System.out.println("db연결 실패");
				}else {
					System.out.println("db연결 성공");
				}
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			break;
		case 2: //정지 
		
			break;
		case 3: //이전곡
			
		
			break;
		case 4: // 다음곡 
			break;
		case 5:
			System.out.println("프로그램을 종료합니다");
			isPlay=false;
		default:
			
			
		}//switch
	}//while
}

}
