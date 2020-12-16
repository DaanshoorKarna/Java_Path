import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player p1 = new Player();
		while(true)
		{
			System.out.println("1. Add Runs Scored");
			System.out.println("2. Calculate average runs scored");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.println("Enter the runs scored");
				int runScored = sc.nextInt();
				p1.addScoreDetails(runScored);
			}
			else if(choice == 2)
			{
				double average = p1.getAverageRunScored();
				System.out.println("Average runs secured");
				System.out.println(average);
			}
			else if(choice == 3)
			{
				break;
			}
			else
			{
				System.out.println("Invalid choice, please try again");
			}
		}
		System.out.println("Thank you for using the Application");
	}


}