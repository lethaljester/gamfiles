package ServantSimulator;

public class Slave {

	public Slave() {
		// TODO Auto-generated constructor stub
		race = new Race();
	}
	private Race race;
		private int ageInDays, height, weight, beautyScore, sexScore;
	private String name;
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return ageInDays/365;
	}
}
