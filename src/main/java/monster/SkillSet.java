package monster;

public class Skillset {
	
	private static final int[] STR_SKILLS = new int[] {Skill.ATHLETICS};
	private static final int[] DEX_SKILLS = new int[] {Skill.ACROBATICS, Skill.SLEIGHT_OF_HAND, Skill.STEALTH};
	private static final int[] CON_SKILLS = new int[] {};
	private static final int[] INT_SKILLS = new int[] {Skill.ARCANA, Skill.HISTORY, Skill.INVESTIGATION, Skill.NATURE};
	private static final int[] WIS_SKILLS = new int[] {Skill.ANIMAL_HANDLING, Skill.INSIGHT, Skill.MEDICINE, Skill.PERCEPTION, Skill.RELIGION, Skill.SURVIVAL};
	private static final int[] CHA_SKILLS = new int[] {Skill.DECEPTION, Skill.INTIMIDATION, Skill.PERFORMANCE, Skill.PERSUASION};
	
	private Skill[] skills;
	
	public Skillset(Stat[] pStats, int[] proList, int proBonus) {
		for(int s: STR_SKILLS) {
			skills[s] = new Skill(s,pStats[0],proList,proBonus);
		}
	}
	
	
}
