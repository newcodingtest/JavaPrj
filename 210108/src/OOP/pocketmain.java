package OOP;

import java.util.Scanner;

public class pocketmain {

	public static void main(String[] args) {
		//피카츄
		Pocketmon Pika=new Pocketmon("전기","피카츄",1800,150,1,"백만볼트");
		//리자몽
		Pocketmon Liza=new Pocketmon("불","리자몽",2000,200,2,"불대포");
		
		//한쪽의 체력이 0이 될때까지 배틀 진행하자!
         
		// 0.포켓몬 입력
		Scanner sc=new Scanner(System.in);
//		System.out.println("포켓몬을 선택하세요:  1. 피카츄 2. 리자몽");
//		int n=sc.nextInt();
//		
//		if(n==1) {  //피카츄
//			System.out.println("1. 공격  2. 필살");
//			int n11=sc.nextInt();
//			if(n11==1) {//공격
//				System.out.println("피카츄가"+Pika.getattack()+"의 기본공격을 리자몽에게 하였습니다.");
//				Liza.getDamage();
//				System.out.println("현재 리자몽의 체력이"+Liza.gethp()+"으로 감소하였습니다");
//			}else if(n11==2) {//필살
//				
//			}
//		}else if(n==2){ //리자몽
//			int n22=sc.nextInt();
//		}
		int count=0;
		System.out.println("포켓몬을 선택하세요:  1. 피카츄 2. 리자몽");
		String pocketName=sc.next();
		
		while(true) {
			
			System.out.println("1. 공격  2. 필살");
			int choice=sc.nextInt();
			// 1. 공격 2. 필살  
			switch(choice) {
			case 1:
				count++;
				if(pocketName.equals(Pika.getName())) {
					Pika.getattack();
					System.out.println("피카츄가"+Pika.getattack()+"의 기본공격을 리자몽에게 하였습니다.");
					Liza.setDamage(Pika.getattack());
					System.out.println("현재 리자몽의 체력이"+Liza.gethp()+"으로 감소하였습니다");
					
				}else if(pocketName.equals(Liza.getName())) {
					Liza.getattack();
					System.out.println("리자몽이"+Liza.getattack()+"의 기본공격을 피카츄에게 하였습니다.");
					Pika.setDamage(Liza.getattack());
					System.out.println("현재 피카츄의 체력이"+Pika.gethp()+"으로 감소하였습니다");
				}else {
					System.out.println("해당 포켓몬이 없습니다");
				}
				break;
				
			case 2:
				count++;
                if(pocketName.equals(Pika.getName())) {
                	Pika.getattack();
					System.out.println("피카츄가"+Pika.getlast_attack()+"의 필살 을 리자몽에게 하였습니다.");
					Liza.setlastDamage(Pika.getattack());
					System.out.println("현재 리자몽의 체력이"+Liza.gethp()+"으로 감소하였습니다");
					
				}else if(pocketName.equals(Liza.getName())) {
					Liza.getattack();
					System.out.println("리자몽가"+Liza.getlast_attack()+"의 필살 을 피카츄에게 하였습니다.");
					Pika.setlastDamage(Liza.getattack());
					System.out.println("현재 피카츄의 체력이"+Pika.gethp()+"으로 감소하였습니다");
				}
				break;
				default:
					System.out.println("잘못 입력했어요");
			
		}
			if(Pika.gethp()==0 ) {
				System.out.println(Pika.getName()+"의 패배");
				System.out.println(Liza.getName()+"의 승리");
				break;
			}else if(Liza.gethp()==0) {
				System.out.println(Liza.getName()+"의 패배");
				System.out.println(Pika.getName()+"의 승리");
				break;
			}
		}
		
		System.out.println("총 "+count+" 라운드 진행");
		// 1. 공격 2. 필살  
		// 순서 꼬부기-리자몽
		// 꼬부기 선제공격(공격력 만큼 상대 포켓몬의 체력이 감소)
		// 리자몽 공격
		// 꼬부기 필살기(공격령*2배 만큼의 상대 포켓몬의 체력이 감소)
		// 리자몽 필살기

		// 몇번의 공격 후에 배틀이 끝나는지 출력하기
		// 누가 승자 패자인지 출력

		

	}

}
