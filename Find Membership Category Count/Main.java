import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		System.out.println("Enter the number of Members");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		List<Member> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			System.out.println("Enter the Member details");
		    String input = sc.nextLine();
		    String memDetails[] = input.split(":");
		    Member member = new Member(memDetails[0],memDetails[1],memDetails[2]);
		    list.add(member);
		}
		System.out.println("Enter the number of times membership category to be searched");
		int no = sc.nextInt();
		
		String[] categories = new String[no];
		int[] count = new int[no];
		
		sc.nextLine();
		for(int i=0;i<no;i++){
		    System.out.println("Enter the Category");
		    String category = sc.nextLine();
		    ZEEShop zs = new ZEEShop(category,list);
		    zs.start();
		    try{
		        zs.join();
		    }catch(Exception e){
		        e.printStackTrace();
		    }
		    
		    categories[i]=zs.getMemberCategory();
		    count[i]=zs.getCount();
		}
		
		for(int i=0;i<no;i++){
		    System.out.println(categories[i] + " : " + count[i]);
		}
	}

}
