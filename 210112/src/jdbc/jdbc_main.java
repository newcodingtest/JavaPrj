package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import musicplayer.Music;

public class jdbc_main {// 바꾸기전 파일

	static Connection conn=null;  //DB에 연결하기위한 객체 인터페이스. 메서드에서 계속 가져다 쓰기때문에 static 전역변수로 선언하여 공유
	static PreparedStatement pst=null; //DB와 자바간의 통신 통로역할
	static ResultSet rs=null; //select 문을 사용할 때 필요
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		boolean isPlay=true;
	
		
		while(isPlay) {
		System.out.println("[1]회원등록 [2]회원수정 [3]회원조회 [4]회원삭제 [5]종료 :");
		int button = sc.nextInt();
		
		switch(button) {
		case 1: //회원 등록 
			
			System.out.print("이름: ");
			String name=sc.next();
			System.out.print("나이: ");
			int age=sc.nextInt();
            System.out.print("성별: ");
			String gender=sc.next();
	
			//try-catch문: 프로그램의 예외처리를 실행하는 구문
			//try문: 실핼할 로직
			//catch문: try문에 작성된 로직이 실행 중 오류가 발생했을 때 동작하는 구문
			
			insertMember(name, age, gender);
			
			
			break;
			
		case 2: //회원수정(나이만)
			System.out.println("나이를 수정할 사람을 입력해주세요");
			name=sc.next();
			System.out.println("나이를 수정하겠습니다");
		    age=sc.nextInt();
			
			updateMember(name, age);
			
		
			break;
			
		case 3: //회원조회
			selectmemberall();
			
		
			break;
		case 4: // 회원삭제
			System.out.println("삭제할 회원의 이름을 입력해주세요");
			name=sc.next();
			
			
			deletemember(name);
			
		
			break;
			
			
			
		case 5: //회원 시스템 종료
			System.out.println("프로그램을 종료합니다");
			isPlay=false;
		default:
			
			
		}//switch
	}//while
}

	private static void deletemember(String name) {
		try { //고정적으로 계속 쓰이는것 복사코드
			String ur1="jdbc:oracle:thin:@localhost:1521:xe"; //localhost부분을 아이피주소로 바꾸면 팀원모두 db서버에 접근 가능
			String user="hr";
			String password="hr";
			
			//1. JDBC 드라이버 로딩(동적로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");//이 구문을 실행했을때 해당 파일이 있는지 없는지 확인.복사쓰기 외울필요x
			
			//2. DB 연결
			conn=DriverManager.getConnection(ur1 , user, password);// 아까 db 커넥션의 propertise 정보
			
			if(conn==null) {
				System.out.println("db연결 실패");
			}else {
				System.out.println("db연결 성공");
			}
			
			//3. DB에 보낼 Query문 작성
			//PreparedStatement:자바프로그램과 sql사이에 데이터를 전송할수있는 통로를 만들어주는 역할
			//인터페이스 클래스임으로 객체를 생성할수없음
			
			String sql="delete from member where name=?"; 
			pst=conn.prepareStatement(sql);
		    pst.setString(1,name);
		 
			//통로를 만들었으니 이제 실핼할수있는 메서드를 만들어야함
			//db의 변화 ex)String sql="insert into member values(?,?,?)";
			//insert delete update 같은경우 executeUpdate() 메서드 사용
			//나머지 select는  executeupQuery() 사용
			
			//4, Query 실행
			pst.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류메시지 출력
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//finally: try~catch문과는 상관없이 무조건 실행하는 구문
		
			
			//6. db관련 연결객체 종료
			//->종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 db연결에 문제가 발생
			//Connection prepareStatement 는 무조건 종료를 해줘야함=반환해줘야함
			
		    try {
				if(pst != null) {
					pst.close();
				}
				if(conn !=null) {
					conn.close();
				}
			}  catch (SQLException e) {
				e.printStackTrace();
			}	
		}//end try~catch~~finally
	}

	private static void selectmemberall() {
		try { //고정적으로 계속 쓰이는것 복사코드
			String ur1="jdbc:oracle:thin:@localhost:1521:xe"; //localhost부분을 아이피주소로 바꾸면 팀원모두 db서버에 접근 가능
			String user="hr";
			String password="hr";
			
			//1. JDBC 드라이버 로딩(동적로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");//이 구문을 실행했을때 해당 파일이 있는지 없는지 확인.복사쓰기 외울필요x
			
			//2. DB 연결
			conn=DriverManager.getConnection(ur1 , user, password);// 아까 db 커넥션의 propertise 정보
			
			if(conn==null) {
				System.out.println("db연결 실패");
			}else {
				System.out.println("db연결 성공");
			}
			
			//3. DB에 보낼 Query문 작성
			//PreparedStatement:자바프로그램과 sql사이에 데이터를 전송할수있는 통로를 만들어주는 역할
			//인터페이스 클래스임으로 객체를 생성할수없음
			
			String sql="select * from member"; 
			pst=conn.prepareStatement(sql);
			
			//4.query  실행
			////db에 저장된 정보를 ResultSet 객체에 저장
			rs=pst.executeQuery();//DB내의 컬럼존재확인
			
			//5.ResultSet 객체의 저장된 db정보를 가져오기
			//rs.getString(인덱스) or rs.getString(컬럼명)
			while(rs.next()) {
				String getName=rs.getString(1);
				int getAge=rs.getInt(2);
				String getGender=rs.getNString(3);
				
				System.out.println(getName+"/"+getAge+"/"+getGender);
			}
		 
			
			//통로를 만들었으니 이제 실핼할수있는 메서드를 만들어야함
			//db의 변화 ex)String sql="insert into member values(?,?,?)";
			//insert delete update 같은경우 executeUpdate() 메서드 사용
			//나머지 select는  executeupQuery() 사용
			
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류메시지 출력
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//finally: try~catch문과는 상관없이 무조건 실행하는 구문
		
			
			//6. db관련 연결객체 종료
			//->종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 db연결에 문제가 발생
			//Connection,prepareStatement 는 무조건 종료를 해줘야함=반환해줘야함
			
		    try {
				if(pst != null) {
					pst.close();
				}
				if(conn !=null) {
					conn.close();
				}
			}  catch (SQLException e) {
				e.printStackTrace();
			}	
		}//end try~catch~~finally
	}

	private static void updateMember(String name, int age) {
		try { //고정적으로 계속 쓰이는것 복사코드
			String ur1="jdbc:oracle:thin:@localhost:1521:xe"; //localhost부분을 아이피주소로 바꾸면 팀원모두 db서버에 접근 가능
			String user="hr";
			String password="hr";
			
			//1. JDBC 드라이버 로딩(동적로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");//이 구문을 실행했을때 해당 파일이 있는지 없는지 확인.복사쓰기 외울필요x
			
			//2. DB 연결
			conn=DriverManager.getConnection(ur1 , user, password);// 아까 db 커넥션의 propertise 정보
			
			if(conn==null) {
				System.out.println("db연결 실패");
			}else {
				System.out.println("db연결 성공");
			}
			
			//3. DB에 보낼 Query문 작성
			//PreparedStatement:자바프로그램과 sql사이에 데이터를 전송할수있는 통로를 만들어주는 역할
			//인터페이스 클래스임으로 객체를 생성할수없음
			
			String sql="update member set age=? where name=?"; 
			pst=conn.prepareStatement(sql);
		    pst.setInt(1,age);
		    pst.setString(2,name);
			
		
			  
			
			//통로를 만들었으니 이제 실핼할수있는 메서드를 만들어야함
			//db의 변화 ex)String sql="insert into member values(?,?,?)";
			//insert delete update 같은경우 executeUpdate() 메서드 사용
			//나머지 select는  executeupQuery() 사용
			
			//4, Query 실행
			pst.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류메시지 출력
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//finally: try~catch문과는 상관없이 무조건 실행하는 구문
		
			
			//6. db관련 연결객체 종료
			//->종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 db연결에 문제가 발생
			//Connection prepareStatement 는 무조건 종료를 해줘야함=반환해줘야함
			
		    try {
				if(pst != null) {
					pst.close();
				}
				if(conn !=null) {
					conn.close();
				}
			}  catch (SQLException e) {
				e.printStackTrace();
			}	
		}//end try~catch~~finally
	}

	private static void insertMember(String name, int age, String gender) {
		try { //고정적으로 계속 쓰이는것 복사코드
			String ur1="jdbc:oracle:thin:@localhost:1521:xe"; //localhost부분을 아이피주소로 바꾸면 팀원모두 db서버에 접근 가능
			String user="hr";
			String password="hr";
			
			//1. JDBC 드라이버 로딩(동적로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");//이 구문을 실행했을때 해당 파일이 있는지 없는지 확인.복사쓰기 외울필요x
			
			//2. DB 연결
			conn=DriverManager.getConnection(ur1 , user, password);// 아까 db 커넥션의 propertise 정보
			
			if(conn==null) {
				System.out.println("db연결 실패");
			}else {
				System.out.println("db연결 성공");
			}
			
			//3. DB에 보낼 Query문 작성
			//PreparedStatement:자바프로그램과 sql사이에 데이터를 전송할수있는 통로를 만들어주는 역할
			//인터페이스 클래스임으로 객체를 생성할수없음
			
			String sql="insert into member values(?,?,?)"; 
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);     //db의 파라미터 인덱스는 1부터 시작함
			pst.setInt(2, age);     
			pst.setString(3, gender);    
			
			//통로를 만들었으니 이제 실핼할수있는 메서드를 만들어야함
			//db의 변화 ex)String sql="insert into member values(?,?,?)";
			//insert delete update 같은경우 executeUpdate() 메서드 사용
			//나머지 select는  executeupQuery() 사용
			
			//4, Query 실행
			pst.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류메시지 출력
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//finally: try~catch문과는 상관없이 무조건 실행하는 구문
		
			
			//6. db관련 연결객체 종료
			//->종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 db연결에 문제가 발생
			//Connection prepareStatement 는 무조건 종료를 해줘야함=반환해줘야함
			
		    try {
				if(pst != null) {
					pst.close();
				}
				if(conn !=null) {
					conn.close();
				}
			}  catch (SQLException e) {
				e.printStackTrace();
			}	
		}//end try~catch~~finally
	}

}
