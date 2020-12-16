import java.util.ArrayList;
import java.util.List;


public class Player {
		private List<Integer> scoreList;
		
		public Player()
		{
			scoreList = new ArrayList<Integer>();
		}


		public List<Integer> getScoreList() {
			return scoreList;
		}


		public void setScoreList(List<Integer> scoreList) {
			this.scoreList = scoreList;
		}
		
		public void addScoreDetails(int runScored)
		{
			scoreList.add(runScored);
		}
		
		public double getAverageRunScored()
		{
			int total=0;
			for(int score : scoreList)
			{
				total = total + score;
			}
			double average = (double)total/scoreList.size();
			return average;
		}
}
