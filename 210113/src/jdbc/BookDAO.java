package jdbc;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BookDAO {
	//DB연동에 필요한 객체변수 선언      --프로젝트 공통사항코드
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	//db연결하는 기능- --프로젝트 공통사항코드
	public void connection() {
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류메시지 출력
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
	
	//db종료하는 기능    - --프로젝트 공통사항코드
	public void close() {
	    try {
	    	if(rs !=null) { rs.close();}
			if(pst != null) {pst.close();}
			if(conn !=null) {conn.close();}
		}catch (SQLException e) {
			e.printStackTrace();
		}	
	}
		
	
	
	//도서관리에 필요한 기능정의
	//--전체조회, 도서검색, 도서입고, 도서수정. 도서삭제
	public ArrayList<BookVO> selectBookAll() {
		ArrayList<BookVO> list=new ArrayList<BookVO>();
		
		//====================db연결기능===============================================
		try { //고정적으로 계속 쓰이는것 복사코드
			connection();
			
			String sql="select * from bookinfo"; 
			pst=conn.prepareStatement(sql);
			
			//4.query  실행
			////db에 저장된 정보를 ResultSet 객체에 저장
			rs=pst.executeQuery();//DB내의 컬럼존재확인
			
			//5.ResultSet 객체의 저장된 db정보를 가져오기
			//rs.getString(인덱스) or rs.getString(컬럼명)
			while(rs.next()) {
				int getNum=rs.getInt(1);
				String getBookCode=rs.getNString(2);
				String getBookTitle=rs.getNString(3);
				String getBookAuthor=rs.getNString(4);
				String getBookPub=rs.getNString(5);
				int getBookPrice=rs.getInt(6);
				String getBookDate=rs.getNString(7);
				//리스트에 회원정보 저장
				list.add(new BookVO(getNum,getBookCode,getBookTitle,
						            getBookAuthor, getBookPub,getBookPrice,getBookDate));
				
				//System.out.println(getName+"/"+getAge+"/"+getGender);
			}
		 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//finally: try~catch문과는 상관없이 무조건 실행하는 구문
			
			close();
		}//end try~catch~~finally
		return list;
		
		
	}
    
	public BookVO selectBook() { 
		BookVO vo=null;
		return vo;
	}
	
	public void insertBook(BookVO book) { //5개의 정보만, 날짜 책번호는 시퀀스로 인해 자동으로 생성
	      
	      try { 
	         connection();
	         
	         // 3. DB에 보낼 Query문 작성
	         // PreparedStatement:자바프로그램과 sql사이에 데이터를 전송할수있는 통로를 만들어주는 역할
	         // 인터페이스 클래스임으로 객체를 생성할수없음

	         String sql = "insert into bookinfo values(book_num.nextval,?,?,?,?,?,sysdate)";
	         pst = conn.prepareStatement(sql);
	         pst.setString(1, book.getBook_code());
	         pst.setString(2, book.getBook_title());
	         pst.setString(3, book.getBook_author());
	         pst.setString(4, book.getBook_Pub());
	         pst.setInt(5, book.getBook_price());
	         
	         
	         
	   
	         // 4, Query 실행
	         pst.executeUpdate();


	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         // finally: try~catch문과는 상관없이 무조건 실행하는 구문

	         // 6. db관련 연결객체 종료
	         // ->종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 db연결에 문제가 발생
	         // Connection prepareStatement 는 무조건 종료를 해줘야함=반환해줘야함

	         close();
	      } // end try~catch~~finally
	   }

	
	public void updateBook(BookVO book) {
	}
	
	public void deleteBook(String book_code) {
		
	}
}
