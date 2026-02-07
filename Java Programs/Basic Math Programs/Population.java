// Population Projection
class Population
{
	public static void main(String[] args){
		long currPop = 312032486;
		//				day hr min sec yr
		long seconds = (365 * 24 * 60* 60)*5;
		
		final long BIRTH = seconds/7;
		final long DEATH = seconds/13;
		final long IMMIGRANTS = seconds/45;
		
		long newPop = currPop + BIRTH - DEATH + IMMIGRANTS;
		System.out.println("Current Population: " + currPop);
		System.out.println("Population after 5 years: " + newPop);	
	}
}

