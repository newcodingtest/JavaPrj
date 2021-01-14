package guicontact;

public class ContactVO {  //전역변수설정-생성자-게터세터-출력메서드(toString) 순서
	private String name;  //DB정보를 자바한테 String 형태로 읽을수있도록 변환하는 클래스
	private int age;
	private String phone;
	
	public ContactVO(String name, int age, String phone) {
		
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return "ContactVO: ["+name+","+age+","+phone+"]";
	}
	
	

}
