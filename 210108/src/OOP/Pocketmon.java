package OOP;

public class Pocketmon {
	
	//1.field
	//[타입] String type ,[이름] String name ,[체력] int hp,
	//[공격력] int attack, [번호] int number
	//[필살기] String last_attack
	
	private String type;
	private String name;
	private int hp;
	private int attack;
	private int number;
	private String last_attack;

	
	//2.creator
	//alt_shift+s 또는 마우스 오른쪽버른-->source-->generate
	
	
    public Pocketmon(String type,String name,int hp,int attack,
    		int number,String last_attack){
    	this.type=type;
    	this.name=name;
    	this.hp=hp;
    	this.attack=attack;
    	this.number=number;
    	this.last_attack=last_attack;
    }
	
	//3.method-->getter 모든 필드들을 가지고 갈 수 있도록 각각 만들어주세요
    
    public String getType() { //입력된 매개변수값을 private 로 전달하기위해서 public으로 지정
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLast_attack() {
		return last_attack;
	}

	public void setLast_attack(String last_attack) {
		this.last_attack = last_attack;
	}

	public String gettype() {
    	return type;
    }
    
    public String getname() {
    	return name;
    }
    
    public int gethp() {
    	return hp;
    }
    
    public int getattack() {
    	return attack;
    }
    
    public int getnumber() {
    	return number;
    }
    
    public String getlast_attack() {
    	return last_attack;
    }
    
    public int setDamage(int attack) {
    	this.hp=this.hp-attack;
    	return this.hp;
    }
    
    public int setlastDamage(int attack) {
    	this.hp=this.hp-2*attack;
    	return this.hp;
    }
    
   public void show() {
	   System.out.println();
	   
   }

}
