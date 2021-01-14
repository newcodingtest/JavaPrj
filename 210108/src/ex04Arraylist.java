import java.util.ArrayList;

public class ex04Arraylist {

	public static void main(String[] args) {
		
		//ArrayList
		//1. 생성
		// ArrayList<객체타입>
		
		//1.문자열 데이터를 저장하는 리스트 생성
		ArrayList<String> list=new ArrayList<String>();

		//2.리스트에 데이터 추가
		list.add("킹크랩 알쥐? 입에 넣으면 baaaaaaaaaaaaaam~!");
		list.add("방어 회, 이거 소주랑 먹으면 뭔지 알쥐? booooooom boooooooom baaaaaaaaaang~!");
		list.add("마지막 산낙지에 초장 쓰");
		
		//3.리스트의 크기 확인
		System.out.println("Counting List: "+list.size());
		
		//중간에 리스트 내 데이터 추가 가능
	    list.add(3,"게장비빔밥 ");
		
		//4.리스트 내 데이터 접근
		for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
		}
		
		 System.out.println();
		 
		//5.리스트 내 데이터 삭제
	    list.remove(0); // [인덱스 값] 또는 [직접 값]을 입력해서 삭제 가능
	    // list.remove("킹크랩 알쥐? 입에 넣으면 baaaaaaaaaaaaaam~!");
	    
	    for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			}
	    
	  //6.리스트가 비워져 있는지 확인
	    System.out.println("빈 리스트인가? "+list.isEmpty());
			
	  //7.리스트 내  데이터 포함 여부 확인(데이터 있는경우 true)
	    System.out.println(list.contains("킹크랩 알쥐? 입에 넣으면 baaaaaaaaaaaaaam~!"));
	    
	  //8.리스트 전체 비우는 기능
	    list.clear();
	    System.out.println("빈 리스트인가? "+list.isEmpty());
	}

}
