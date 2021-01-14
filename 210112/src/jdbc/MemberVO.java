package jdbc;


//VO클래스 만들때는  DB에 만들어진  TABLE 의 컬럼수와 타입을 맟추어 작성
public class MemberVO {
	private String name;
	private int age;
	private String gender;
	
	
	
	public MemberVO(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "MemberVo=["+name+","+age+","+gender+"]";
	}

}
