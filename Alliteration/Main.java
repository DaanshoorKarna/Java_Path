import java.util.*;
public class Main {

public int solve(String letter, String line){
	int tokens=0, trueCount=0, temp=0, fscore=0;
	StringTokenizer str = new StringTokenizer(line);
	tokens = str.countTokens();
	if(tokens<3){
		return 0;
	}
	else if(tokens>=3){
		for(int i =0; i <tokens;i++){
			if(str.nextToken().startsWith(letter))
			{
				trueCount++;
			}
			else{
				return 0;
			}
		}
	}
	if(trueCount==tokens){
		fscore=2+((tokens-3)+2);
		return fscore;
	}
	return 0;
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 int score=0;
		 String ipletter,ip;
		 System.out.println("Enter the letter");
		 ipletter =sc.nextLine();
		 ip=sc.nextLine();
		 Main mn=new Main();
		 score=mn.solve(ipletter.toLowerCase(),ip.toLowerCase());
		 if(score==0){
			 System.out.println("No score");
		 }
		 else{
			 System.out.println("Good,You get a score of " + score);
		 }
		sc.close();  
	}

}
