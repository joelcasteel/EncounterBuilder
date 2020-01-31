package monster;

public class Monster {
	
	//Name Strings
	private  final String name;
	//Statblock Object
	private  final Statblock stats;
	//SKillset Object
	private  final Skillset skills;
	
	//Array of integers that correspond to Skill.SOME_SKILL
	private final int[] skillPros;
	
	//Array of integers that correspond to Stat.SOME_STAT
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
