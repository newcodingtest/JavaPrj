package jdbc;
import java.util.ArrayList;
import java.util.Scanner;

public class Book_Main {

   public static void main(String[] args) {
      // 1. 아래와 같이 메뉴를 출력하는 프로그램을 작성하시오
      // ======================도서 관리 프로그램
      // 1.전체도서검색 2.도서검색 3.도서입고 4.도서수정 5.도서삭제 6.종료>>
      Scanner sc = new Scanner(System.in);
      boolean isPlay=true;
      
      //DB관련 기능을 가진 객체 생성
      BookDAO dao=new BookDAO();
      
      System.out.println("=====도서관리프로그램 입니다.=====");
      while(isPlay) {
      System.out.println("1.전체도서검색 2.도서검색 3.도서입고 4.도서수정 5.도서삭제 6.종료>>");
      int select = sc.nextInt();
      sc.nextLine();
      
      switch (select) {
      // ===================전체도서검색=======================
      case 1://전체도서검색
         ArrayList<BookVO> books=dao.selectBookAll();
         
      
         
         for(int i=0; i<books.size(); i++) {
            System.out.println(books.get(i));
         }
         
         break;

      // ===================도서검색==========================
      case 2://도서검색

         break;
      // ===================도서입고==========================
      case 3://도서입고
         //코드, 도서명, 저자, 출판사, 가격을 DB에 저장하시오.
         System.out.println("도서코드: ");
         String code = sc.nextLine();
         System.out.println("도서명: ");
         String title = sc.nextLine();
         System.out.println("저자: ");
         String author = sc.nextLine();
         System.out.println("출판사: ");
         String pub = sc.nextLine();
         System.out.println("가격: ");
         int price = sc.nextInt();
         
         BookVO book = new BookVO(code, title, author, pub, price);
         
         dao.insertBook(book);
         System.out.println("새로운 도서가 등록되었습니다.");
         
         break;
      // ===================도서수정==========================
      case 4://도서수정

         break;
      // ===================도서삭제==========================
      case 5:// 도서삭제
         System.out.println("삭제할 도서의 책명을 입력해주세요");
         break;
      // ===================종료============================
      case 6:// 종료
         System.out.println("도서 프로그램을 종료합니다");
         isPlay = false;
      default:
        }//switch
     }//while

   }

}



