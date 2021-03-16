package assignments;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monster m;
		m= new FireMonster();
		System.out.println(m.attack());
		
		m = new WaterMonster();
		System.out.println(m.attack());
		
		m = new StoneMonster();
		System.out.println(m.attack());

	}

}


abstract class Monster{
	
	private String name;
	
	abstract public String attack();
}

class FireMonster extends Monster{
	
	public String attack() {
		return "Fire Monster";
	}
}

class WaterMonster extends Monster{
	
	public String attack() {
		return "Water Monster";
	}
}

class StoneMonster extends Monster{
	
	public String attack() {
		return "Stone Monster";
	}
}