package monster;

public class Skill {
	//DEX
		public static final int ACROBATICS 			= 0;
		//WIS
		public static final int ANIMAL_HANDLING		= 1;
		//INT
		public static final int ARCANA 				= 2;
		//STR
		public static final int ATHLETICS 			= 3;
		//CHA
		public static final int DECEPTION 			= 4;
		//INT
		public static final int HISTORY 			= 5;
		//WIS
		public static final int INSIGHT 			= 6;
		//CHA
		public static final int INTIMIDATION 		= 7;
		//INT
		public static final int INVESTIGATION		= 8;
		//WIS
		public static final int MEDICINE			= 9;
		//INT
		public static final int NATURE				= 10;
		//WIS
		public static final int PERCEPTION			= 11;
		//CHA
		public static final int PERFORMANCE			= 12;
		//CHA
		public static final int PERSUASION			= 13;
		//WIS
		public static final int RELIGION			= 14;
		//DEX
		public static final int SLEIGHT_OF_HAND		= 15;
		//DEX
		public static final int STEALTH				= 16;
		//WIS
		public static final int SURVIVAL			= 17;
		
		private int skillID;
		private int skillMod;
		
		public Skill(int id, Stat stat, int[] proList, int proBonus) {
			skillID = id;
			boolean prof = false;
			for(int i =0; i < proList.length; i++) {
				if(proList[i] == skillID) prof = true;
			}
			if(prof) {
				skillMod = stat.getModifier() + proBonus;
			}
			skillMod = stat.getModifier();
			
		}
		
		@Override
		public String toString() {
			return "Skill: " + skillID + " Modifier: " + skillMod;
		}
		
		

}
