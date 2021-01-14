package musicplayer;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;




public class MusicMain2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean isPlay=true;
		//뮤직플레이어 객체 생성
		Musicplayer mPlayer=new Musicplayer();
		
		//노래를 재생시켜주는 라이브러리 player내부의 MP3Player 객체생성
		MP3Player mp3=new MP3Player();
		

		while(isPlay) {
		System.out.println("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 :");
		int button = sc.nextInt();
		switch(button) {
		case 1: //재생
		System.out.println(mPlayer.play());
		mp3.play(mPlayer.play().getPath());
		break;
		case 2: //정지 
			System.out.println(mPlayer.stop());
			mp3.stop();
			break;

		case 3: //이전곡
			Music m=mPlayer.prePlay();
			
			if(m==null) {
				System.out.println("이전곡을 실행할 수 없습니다");
			}else {
				
			    if(mp3.isPlaying()) {
			    	mp3.stop();
			    	mp3.play(m.getPath());
			    }
			    
			    System.out.println(m);
				}
			break;

		case 4: // 다음곡 
			m=mPlayer.nextPlay();
			if(m==null) {
				System.out.println("다음곡을 실행할 수 없습니다");
			}else {
			    
				if(mp3.isPlaying()) {
			    	mp3.stop();
			    	mp3.play(m.getPath());
			    }
				
			    System.out.println(m);
				}
			break;
		case 5:
			System.out.println("플레이어를 종료합니다");
			mp3.stop();
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