package OOP;


public class TeacherPocketmon {

   // 1. 필드 --> private
   private String type;
   private String name;
   private int hp;
   private int attack;
   private int number;
   private String pilsal;

   // 2. 생성자 --> 모든 필드를 채울 수 있도록 생성
   // alt+ shift + s --> 마우스 오른쪽 버튼 --> source --> generate ~~~
   public TeacherPocketmon(String type, String name, int hp, int attack, int number, String pilsal) {
      this.type = type;
      this.name = name;
      this.hp = hp;
      this.attack = attack;
      this.number = number;
      this.pilsal = pilsal;
   }

   // 3. 메소드 --> getter 모든 필드들을 가지고 갈 수 있도록 각각 만들어주세요.
   public String getType() {
      return type;
   }

   public String getName() {
      return name;
   }

   public int getHp() {
      return hp;
   }

   public int getAttack() {
      return attack;
   }

   public int getNumber() {
      return number;
   }

   public String getPilsal() {
      return pilsal;
   }

   // 체력을 다시 세팅할 수 있는 메소드
   public void setHP(int hp) {
      this.hp = hp;
   }

   // Main클래스 생성해놓기!

}