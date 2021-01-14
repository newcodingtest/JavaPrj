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

	static Connection conn=null;  //DB에 연결하기위한 객체 인터페이스. 메서드에서 계속 가져다 쓰기때문에 static 전역변수로 선언하여 공유
	static PreparedStatement pst=null; //DB와 자바간의 통신 통로역할
	static ResultSet rs=null; //select 문을 사용할 때 필요
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		boolean isPlay=true;
	
		//DB에 관련된 기능들을 관리하는 dao 객체 생성
		memberDAO dao=new memberDAO();
		
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
			dao.insertMember(name, age, gender);
			break;
			
		case 2: //회원수정(나이만)
			System.out.println("나이를 수정할 사람을 입력해주세요");
			name=sc.next();
			System.out.println("나이를 수정하겠습니다");
		    age=sc.nextInt();
		    dao.updateMember(name, age);
			break;
			
		case 3: //회원조회
			ArrayList<MemberVO> members=dao.selectmemberall();
			for (int i = 0; i < members.size(); i++) {
//				System.out.println(members.get(i));
				System.out.print("이름: "+members.get(i).getName()+" ");
				System.out.print("나이: "+members.get(i).getAge()+" ");
				System.out.print("성별: " +members.get(i).getGender() + " ");
				System.out.println();
				
			}
			break;
		case 4: // 회원삭제
			System.out.println("삭제할 회원의 이름을 입력해주세요");
			name=sc.next();
			dao.deletemember(name);
			break;
			
		case 5: //회원 시스템 종료
			System.out.println("프로그램을 종료합니다");
			isPlay=false;
		default:
		}//switch
	}//while
}

	
}
