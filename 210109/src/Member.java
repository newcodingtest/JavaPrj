
public class Member {
	   private String memberId;
	   private String memberName;
	   
	public Member(String memberId, String memberName) {
	   this.memberId = memberId;
	   this.memberName = memberName;
	}

	public void setMemberId(String memberId) {
	   this.memberId = memberId;
	}
	public void setMemberName(String memberName) {
	   this.memberName = memberName;
	}
	
	public String getMemberId() {
	   return memberId;
	}
	public String getMemberName() {
	   return memberName;
	}

	@Override
	public String toString() {
	   return memberName+"님의 아이디는 "+memberId+"입니다";
	}

}




