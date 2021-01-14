package musicplayer;

import java.util.ArrayList;

//뮤직플레이어의 기능을 관리하는 클래스
//->재생, 중지, 다음곡, 이전곡
public class Musicplayer {
	
		ArrayList<Music>musiclist;    //musiclist라는 객체를 사용하겠다고만 전역에 선언
		int pos;                      //int 는 기본0값 string은 null값
		
		//생성자는 객체를 사용하기전 초기화 하는것
		public  Musicplayer() { //노래정보를 초기화
			musiclist=new ArrayList<>();
		musiclist.add(new Music("다시만날까봐","vos",15,"music/다시만날까봐.mp3"));
		musiclist.add(new Music("보고싶다","김범수",30,"music/보고싶다.mp3"));
		musiclist.add(new Music("소주한잔","임창정",58,"music/소주한잔.mp3"));
		musiclist.add(new Music("hello","beyonce",270,"music/hello.mp3"));
	}
		
		public Music play() { //현 메서드는  Music 타입 : ArrayList<Music>musiclist; 타입 참고
			return musiclist.get(pos);
		}

		public String stop() {
			return "노래를 중지합니다.!";
		}
		
		public Music prePlay() {
			if(pos==0) {
				return null;  //이전곡이 없을 경우
			}else {
			    pos--;
			return musiclist.get(pos);
				}
		}
		
		public Music nextPlay() {
			if(pos==musiclist.size()-1) {
				return null;
			}else {
			    pos++;
			   return musiclist.get(pos);
				}
		}
}
