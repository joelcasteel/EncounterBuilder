package monster;

public class Monster {
	
	private  final String name;
	private  final Statblock stats;
	private  final Skillset skills;
	private final int[] skillPros;
	private final int[] savePros;
	
	
	public Monster(String pName, Statblock pStats, Skillset pSkills, int[] pSkillPros, int[] pSavePros) {
		name = pName;
		stats = pStats;
		skills = pSkills;
		skillPros = pSkillPros;
		savePros = pSavePros;
	}
	
	@Override
	public String toString() {
		return "Updog";
	}
	
	
}
