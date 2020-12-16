import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 
		int a,b,revA,revB,prod1,prod2;
		System.out.println("Enter the 1st 2-digit number:");
		a=sc.nextInt();
		System.out.println("Enter the 2nd 2-digit number:");
        b=sc.nextInt();
        
		revA=((a%10)*10)+(a/10);
		revB=((b%10)*10)+(b/10);

		prod1=a*b;
		prod2=revA*revB;
		
		if(prod1 == prod2){
			System.out.println("Correct pair found");
		}
		else
			System.out.println("Correct pair not found");
	}

}
