package monster;

/**
 * Stat Wrapper Class for various monsters
 * 
 * @author joel
 *
 */
public class Stat {
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

