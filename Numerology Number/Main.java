import java.util.*;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    long n = sc.nextLong();
    System.out.println("Sum of digits");
    System.out.println(digSum(n));
    System.out.println("Numerology Number");
    System.out.println(numerology(n));
    System.out.println("Number of odd numbers");
    System.out.println(oddcount(n));
    System.out.println("Number of even numbers");
    System.out.println(evencount(n));
    
    	
    
		    
	}
    
	public static long evencount(long n){
		long even=0;
		while(n>0){
			long rem = n%10;
			if(rem%2==0){
				even++;
			}
			n/=10;
		}
		return even;
		
	}
	
	public static long oddcount(long n){
		long odd=0;
		while (n>0){
			long rem=n%10;
			if(rem%2!=0){
				odd++;
			}
			n/=10;
		}
		return odd;
		
	}
	
	static long numerology(long n){
		long sum=0;
		while(n>0 ||sum>9){
			if(n==0){
				n=sum;
				sum=0;
			}
			sum+=n%10;
			n/=10;
		}
		return sum;
		
	}
	
	static long digSum(long n){
		long total=0;
		while(n>0){
			total+=n%10;
			n/=10;
		}
		return total;
	}
}
