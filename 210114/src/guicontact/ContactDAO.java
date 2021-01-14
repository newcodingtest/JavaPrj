package guicontact;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ContactDAO {//변수선언-db 연동종료기능-기능메서드구현
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	public void connection() { //db연결기능--프로젝트 공통코드
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
	
	//기능정의:연락처추가,삭제,전체연락처보기
	
	//순서:db연결-sql작성문 및 넘겨주기prapared-sql문이 틀릴수도있기에 예외처리문-pst로 값채워넣기(Vo저장값을 get으로 전달)
	//-sql문 실행-finally 이용한 db종료
	public void addContact(ContactVO vo) {//연락처추가
		
		connection(); //db연결
	
		try {//sql문이 오류가 날수있기 때문에 
			String sql="insert into contact values(?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,vo.getName());
			pst.setInt(2,vo.getAge());
			pst.setString(3,vo.getPhone());
			
			pst.executeUpdate();//sql문 실행 크흠..Large사용하지말라고 했는데~아그러니 데이터가 저장이 안되죠~
			
		} catch (Exception e) {
			
		} finally{//예외처리 상관없이 무조건 종료
			close();
		}
	}
	
	public void deleteContact(String selectName) {
        connection();

        try {
        String sql = "delete from contact where name=?"; 
        pst = conn.prepareStatement(sql);
        pst.setString(1,selectName);
        //4. start Query 
        pst.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
        close();
        }


        close();

    }

	public ArrayList<ContactVO> selectContactAll() {
		ArrayList<ContactVO>list=new ArrayList<ContactVO>();
		connection();
		//====================db연결기능===============================================
				try { //고정적으로 계속 쓰이는것 복사코드
					String sql="select * from contact"; 
					pst=conn.prepareStatement(sql);
					
					//4.query  실행
					////db에 저장된 정보를 ResultSet 객체에 저장
					rs=pst.executeQuery();//DB내의 컬럼존재확인
					
					//5.ResultSet 객체의 저장된 db정보를 가져오기
					//rs.getString(인덱스) or rs.getString(컬럼명)
					//이것도 getNString이 아니라 getString!!
					while(rs.next()) {
						String getName=rs.getString(1);
						int getAge=rs.getInt(2);
						String getPhone=rs.getString(3);
					
						//리스트에 회원정보 저장
						list.add(new ContactVO(getName,getAge,getPhone
								            ));
						
						//System.out.println(getName+"/"+getAge+"/"+getGender);
					}
				 
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
		close();
	    }
		
		return list;
	}
	
	
	
	
}
