package EncounterBuilder;

public class Monster {
	private final String name;
	private final int CR;
	private final int HP;
	private final int AC;
	private final int INIT;
	
	public Monster(String pName, int[] pStats) {
		name = pName;
		CR = pStats[0];
		HP = pStats[1];
		AC = pStats[2];
		INIT = pStats[3];
	}
	
	@Override
	public String toString() {
		return name + "/n"+"ChallengeRating: " + CR;
	}
	
	
}
