import java.util.Random;
import java.util.Scanner;



public class ex03_baseball { //숫자야구게임

	public static void main(String[] args) {


		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		
		int strike=0;
		int ball=0;
		
		System.out.println("랜덤 번호를 출력하시오");
		int ran1=ran.nextInt(10)+1;
		int ran2=ran.nextInt(10)+1;
		int ran3=ran.nextInt(10)+1;
		
		System.out.println(ran1);
		System.out.println(ran2);
		System.out.println(ran3);
		
		while(true) {
		System.out.println("첫번째:");
		 int r1=sc.nextInt();
		 
			if(r1==ran1) { strike++; System.out.println("스트라이크");}
			else if(r1==ran2 || r1==ran3) {ball++; System.out.println("볼");}
			else {System.out.println("out");}
			
		System.out.println("두번째:");
		 int r2=sc.nextInt();
		 
		    if(r2==ran2) {strike++; System.out.println("스트라이크");}
			else if(r2==ran1 || r2==ran3) {ball++; System.out.println("볼");}
			else {System.out.println("out");}
			
		System.out.println("세번째");
		 int r3=sc.nextInt();
		
		    if(r3==ran3) {strike++; System.out.println("스트라이크");}
		    else if(r3==ran1 || r3==ran2) {ball++; System.out.println("볼");}
		    else {System.out.println("out");}
		
		System.out.println("스트라이크"+strike+"볼"+ball);
            if(r1==ran1 &&r2==ran2 &&r3==ran3 ) {
        	 System.out.println("성공");
	         break;
        }
		}
	}
	
//	Random ran = new Random();
//    int ran1 = 0;
//    int ran2 = 0;
//    int ran3 = 0;
//    int strike=0;
//    int ball=0;
//    int out=0;
//    while(true) {
//        ran1 = ran.nextInt(10);
//        ran2 = ran.nextInt(10);
//        ran3 = ran.nextInt(10);
//        if(ran1!=ran2&&ran2!=ran3&&ran1!=ran3) {
//            break;
//        }
//    }
//    Scanner sc = new Scanner(System.in);
//    while(true) {
//        System.out.print("1st number : ");
//        int num1 = sc.nextInt();
//        if(ran1==num1) {
//            strike++;
//        }else if(ran2==num1ran3==num1){
//            ball++;
//        }else {
//            out++;
//        }
//        System.out.print("2nd number : ");
//        int num2 = sc.nextInt();
//        if(ran2==num2) {
//            strike++;
//            }else if(ran1==num2ran3==num2){
//                ball++;
//            }else {
//                out++;
//        }
//        System.out.print("3rd number : ");
//        int num3 = sc.nextInt();
//        if(ran3==num3) {
//            strike++;
//            }else if(ran1==num3||ran2==num3){
//                ball++;
//                }else {
//                    out++;
//                }
//    if(strike==3) {
//        System.out.println("Home run!!");
//        break;
//    }else {
//        System.out.println(strike+" Strikes "+ball+" Balls "+out+" Outs");
//        strike=0;
//        ball=0;
//        out=0;
//        }
//    }
//    }
//    }

}



