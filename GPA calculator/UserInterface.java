import java.util.*;
public class UserInterface {
	
public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     int choice;
     
     GPAcalculator gpacalculator = new GPAcalculator();
     
     do{
    	 
    	 System.out.println("1.Add Grade");
    	 System.out.println("2.Calculator GPA");
    	 System.out.println("3.Exit");
    	 System.out.println("Enter your choice");
    	 
    	 choice=Integer.parseInt(sc.nextLine());
    	 
    	 switch(choice){
    	 
    	 case 1:
    	 {
    		    System.out.println("Enter the obtained grade");
    		    String g=sc.nextLine();
    		    char grade = g.trim().charAt(0);
    		    
    		    gpacalculator.addGradePoint(grade);
    		    break;
    	 }
    	 
    	 case 2:
    	 {
    		     double gpa = gpacalculator.calculateGPAScored();
    		     if(gpa==0){
    		    	 System.out.println("No Grade Points available");
    		     }else{
    		    	 System.out.println("GPA Scored");
    		    	 System.out.println(gpa);
    		     }
    		     break;
    	 }
    	 case 3:
    	 
    		 System.out.println("Thankyou for using the application");
             break;
		default:
			      break;
	}
}while(choice!=3);
     
}
}
