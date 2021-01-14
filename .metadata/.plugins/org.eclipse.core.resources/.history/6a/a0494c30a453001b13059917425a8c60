package musicplayer;
import java.util.ArrayList;
import java.util.Scanner;




public class MusicMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean isPlay=true;
		int pos=0;
		
		ArrayList<Music>musiclist=new ArrayList<Music>();
	   
		//4곡의 노래정보보를 musiclist에 초기화
		//ArrayList에 객체를 저장하는 방법 1
		Music m1=new Music("다시만날까봐","vos",15);
		musiclist.add(m1);
		
		//ArrayList에 객체를 저장하는 방법 2
		musiclist.add(new Music("보고싶다","김범수",30));
		musiclist.add(new Music("소주한잔","임창정",58));
		musiclist.add(new Music("hello","beyonce",270));
		
		while(isPlay) {
		 
		System.out.println("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 :");
		int button = sc.nextInt();
		
		switch(button) {
	
		case 1: //재생
		System.out.println(musiclist.get(pos));
		case 2: //정지 
			System.out.println("노래를 종료합니다");
			break;

		case 3: //이전곡
			if(pos==0) {
				System.out.println("이전곡을 실행할 수 없습니다");
			}else {
			    pos--;
			    System.out.println(musiclist.get(pos));
				}
			break;

		case 4: // 다음곡 
			if(pos==musiclist.size()-1) {
				System.out.println("다음곡을 실행할 수 없습니다");
			}else {
			    pos++;
			    System.out.println(musiclist.get(pos));
				}
			break;
		case 5:
			System.out.println("플레이어를 종료합니다");
			break;
		default:
			System.out.println("잘못된 기능입니다 다시 선택해주세요");
			break;
		}
		
		if(button==5) {
			break;
		}
		
		}

  }
} 