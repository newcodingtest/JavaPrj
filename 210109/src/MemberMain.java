import java.util.ArrayList;
import java.util.Scanner;


public class MemberMain {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Member m = new Member("pulpul8282","윤주영");
      boolean isPlay=true;
      //
      ArrayList<Member> memberList=new ArrayList<Member>();
      System.out.println("==========[회원관리 프로그램]==========");
      
      
      while(isPlay) {
         System.out.println("[1] 회원등록  [2] 전체 회원 조회  [3] 회원 삭제  [4] 종료   ");
         int button=sc.nextInt();     
         
         switch (button) {
         case 1: //회원등록
        	 System.out.print("등록할 회원 아이디: ");
        	 String id=sc.next();
        	 System.out.print("등록할 회원 이름: ");
        	 String name=sc.next();
        	 
        	//아이디와 정보를 이용하여 회원객체로 생성
        	 Member member=new Member(id,name); //new Member(id,name) 은 주소값
        	 
        	 //회원객체를 리스트에 저장
        	 memberList.add(member); //memberList.add(new Member(id,name)); 로도 가능하다
        	 System.out.println(memberList.size());
        	 
            break;
         case 2:  //회원조회
        	 //forEach문-반복문의 한 종류, 순서대로 접근할 때 사용
        	 //for(자료형 변수명:리스트 변수명){
             //   }
        	 if (memberList.isEmpty()) {
                    System.out.println("나의본체 현재 등록된 회원이 없습니다");				
			}else {
        	 for(Member m1:memberList) { //멤버리스트에 담긴 객체들의 정보를 보여준다
        		 System.out.println(m1);
        	 }
			}
            break;
            
         case 3: 
        	 System.out.print("삭제할 아이디 입력: ");
        	 id=sc.next();
        	 //회원삭제, 리스트내에 멤버(아이디,이름) 자체로 담겨있기때문에 삭제 방법을 생각해보자
        	 //1. 반복문으로 memberList에 있는 Member 객체들에게 접근
        	// 2.접근한 Member객체들이 가지고 있는 id값 접근
        	// 3.접근한 id와 삭제할 id값 비교
        	// 4.일치시 해당 Member객체가 있는 위치 값을 이용해서 삭제
        	for(int i=0; i<memberList.size(); i++) {
        		Member tmp=memberList.get(i);
        		String memberId=tmp.getMemberId();
        		
        		if(memberId.equals(id)) { 
        			memberList.remove(i);  //객체값으로 삭제했기때문에 id와 이름값 둘다 삭제됨
        			System.out.println(" "+id+"회원님이 삭제되었습니다");
        			break;
        		}
        		
        		if(i==memberList.size()-1) {
        			System.out.println("존재하지 않는 회원입니다.");
        		}
        		
        	}
        	
            break;
         case 4:
            break;
         default:
            System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            break;
         }
         if (button==4) {
            System.out.println("프로그램이 종료되었습니다.");
            isPlay=false;
            break;
         }
      }
   }
}