package monster;

/**
 * Stat Wrapper Class for various monsters
 * 
 * @author joel
 *
 */
public class Stat {
	
	public static final int STRENGTH 		= 0;
	public static final int DEXTERITY 		= 1;
	public static final int CONSTITUTION 	= 2;
	public static final int INTELLIGENCE 	= 3;
	public static final int WISDOM 			= 4;
	public static final int CHARISMA 		= 5;
	
	
	//Int for stat
	private final int stat;
	
	public Stat() {
		stat = 777;
	}
	
	
	/**
	 * Constructor for Stats
	 * @param pStat
	 */
	public Stat(int pStat) {
		stat = pStat;
	}
	
	/**
	 * Returns the the actual stat value.
	 * @return
	 */
	public int getStat() {
		return stat;
	}
	
	/**
	 * Returns the modifier based on the stat
	 * @return
	 */
	public int getModifier() {
		return (stat-10)/2;
	}
	
	/**
	 * Returns the passive for a stat
	 * @return passive
	 */
	public int getPassive() {
		return 10 + getModifier();
	}
}

