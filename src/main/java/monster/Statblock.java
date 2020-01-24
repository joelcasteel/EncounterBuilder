package monster;


public class Statblock {
	
	public static final int STRENGTH 		= 0;
	public static final int DEXTERITY 		= 1;
	public static final int CONSTITUTION 	= 2;
	public static final int INTELLIGENCE 	= 3;
	public static final int WISDOM 			= 4;
	public static final int CHARISMA 		= 5;
	
	
	private final Stat[] stats;
	private final int HP;
	private final int CR;
	private final int AC;
	private final int proBonus;
	
	/**
	 * Default Constructor for v01D
	 * SHOULD NOT BE USED
	 */
	public Statblock() {
		stats = new Stat[6];
		for(int i = 0; i<stats.length; i++) {
			stats[i] = new Stat();
		}
		
		HP = 7777777;
		CR = 7777;
		AC = 777;
		proBonus = 77;
	}
	
	/**
	 * Actual Constructor for StatBlock
	 * @param pStats
	 * @param pHP
	 * @param pCR
	 * @param pAC
	 * @param pProBonus
	 */
	public Statblock(Stat[] pStats, int pHP, int pCR, int pAC, int pProBonus) {
		stats = pStats;
		HP = pHP;
		CR = pCR;
		AC = pAC;
		proBonus = pProBonus;
	}
	
	/**
	 * 
	 * @param type - Should use a predefined final type ex: Statblock.STRENGTH
	 * @return
	 */
	public Stat getStat(int type) {
		return stats[type];
	}
	
	public int getProBonus() {
		return proBonus;
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getCR() {
		return CR;
	}
	
	public int getAC() {
		return AC;
	}
	
	
	
}
