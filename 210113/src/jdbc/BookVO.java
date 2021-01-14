package jdbc;

public class BookVO {
 
			private int num;
			private String book_code;
			private String book_title;
			private String book_author; 
			private String book_pub;
			private int book_price;
			private String book_date;
			
			
			
			
			
			//도서등록시 사용할 생성자 7개
			public BookVO(int num, String book_code, String book_title, String book_author, String book_pub,
					int book_price, String book_date) {
				
				this.num=num;
				this.book_code = book_code;
				this.book_title = book_title;
				this.book_author = book_author;
				this.book_pub = book_pub;
				this.book_price = book_price;
				this.book_date=book_date;
			
			}
			//도서등록시 초기화 해주는 생성자 5개
			public BookVO(String book_code, String book_title, String book_author, String book_pub,
					int book_price) {
				
				this.book_code = book_code;
				this.book_title = book_title;
				this.book_author = book_author;
				this.book_pub = book_pub;
				this.book_price = book_price;
				
			}

			public int getNum() {
				return num;
			}
			public void setNum(int num) {
				this.num = num;
			}
			public String getBook_code() {
				return book_code;
			}
			public void setBook_code(String book_code) {
				this.book_code = book_code;
			}
			public String getBook_title() {
				return book_title;
			}
			public void setBook_title(String book_title) {
				this.book_title = book_title;
			}
			public String getBook_author() {
				return book_author;
			}
			public void setBook_author(String book_author) {
				this.book_author = book_author;
			}
			public String getBook_Pub() {
				return book_pub;
			}
			public void setBook_Pub(String book_pub) {
				this.book_pub = book_pub;
			}
			public int getBook_price() {
				return book_price;
			}
			public void setBook_price(int book_price) {
				this.book_price = book_price;
			}
			public String getBook_date() {
				return book_date;
			}
			public void setBook_date(String book_date) {
				this.book_date = book_date;
			}
	
			public String toString() {
				return "["+num+","+book_code+","+book_title+","+book_author+","+book_pub+","+book_price+","+book_date+"]";
			}

}
