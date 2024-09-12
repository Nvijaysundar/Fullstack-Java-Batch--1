import java.util.HashMap;

public class Movie {
	private HashMap<Integer,HashMap<Integer,Integer>> am = null;
	private HashMap<Integer,HashMap<Integer,Integer>> pm = null;
	
	public Movie()
	{
		am = new HashMap<Integer, HashMap<Integer,Integer>>();
		pm = new HashMap<Integer, HashMap<Integer,Integer>>();
		
		for(int i=1;i<=3;i++)
		{
			am.put(i,new HashMap<Integer,Integer>());
			pm.put(i,new HashMap<Integer,Integer>());
			
			for(int j=1;j<=5;j++)
			{
				am.get(i).put(j, 0);
				pm.get(i).put(j, 0);
			}
		}
	}

	public HashMap<Integer, HashMap<Integer, Integer>> getAm() {
		return am;
	}

	public HashMap<Integer, HashMap<Integer, Integer>> getPm() {
		return pm;
	}
}
