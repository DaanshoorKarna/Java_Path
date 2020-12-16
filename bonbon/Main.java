package bonbon;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the advertisement id");
			int adid=sc.nextInt();
			
			System.out.println("Enter the priority(high/medium/low)");
			String pri=sc.next();
	
			System.out.println("Enter the no of days advertisement is published");
			int day=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the client name");
			String clinm=sc.nextLine();
			
			System.out.println("Enter the type of Advertisement(video/image/text");
			String adtype=sc.next();
			
			if(adtype.equals("video")){
				System.out.println("Enter the duration in minutes");
				int dur =sc.nextInt();
				
				VideoAdvertisement video=new VideoAdvertisement(adid,pri,day,clinm,dur);
				System.out.println("Enter the base cost");
				float baseCost=video.calculateAdvertisementCharge((float)sc.nextInt());
				float baseAdvertisementCost=baseCost*dur*day;
				float boostercost=0,serviceCost=0;
				
				if(pri.equals("high")){
					boostercost=(baseAdvertisementCost*10)/100;
					serviceCost=1000;
				}
				if(pri.equals("medium")){
					boostercost=(baseAdvertisementCost*7)/100;
					serviceCost=700;
				}
				if(pri.equals("low")){
					boostercost=0;
					serviceCost=200;
				}
				System.out.println("The advertisement cost is:"+(baseAdvertisementCost+boostercost+serviceCost));
				
			}
			
			if(adtype.equals("text")){
				System.out.println("Enter the number of characters");
				int ch =sc.nextInt();
				
				TestAdvertisement text=new TestAdvertisement(adid,pri,day,clinm,ch);
				System.out.println("Enter the base cost");
				float baseCost=text.calculateAdvertisementCharge((float)sc.nextInt());
				float baseAdvertisementCost=baseCost*ch*day;
				float boostercost=0,serviceCost=0;
				
				if(pri.equals("high")){
					boostercost=(baseAdvertisementCost*10)/100;
					serviceCost=1000;
				}
				if(pri.equals("medium")){
					boostercost=(baseAdvertisementCost*7)/100;
					serviceCost=700;
				}
				if(pri.equals("low")){
					boostercost=0;
					serviceCost=200;
				}
				System.out.println("The advertisement cost is:"+(baseAdvertisementCost+boostercost+serviceCost));
				
			}
			
			if(adtype.equals("image")){
				System.out.println("Enter the number of inches");
				int inch =sc.nextInt();
				
				ImageAdvertisement image=new ImageAdvertisement(adid,pri,day,clinm,inch);
				System.out.println("Enter the base cost");
				float baseCost=image.calculateAdvertisementCharge((float)sc.nextInt());
				float baseAdvertisementCost=baseCost*inch*day;
				float boostercost=0,serviceCost=0;
				
				if(pri.equals("high")){
					boostercost=(baseAdvertisementCost*10)/100;
					serviceCost=1000;
				}
				if(pri.equals("medium")){
					boostercost=(baseAdvertisementCost*7)/100;
					serviceCost=700;
				}
				if(pri.equals("low")){
					boostercost=0;
					serviceCost=200;
				}
				System.out.println("The advertisement cost is:"+(baseAdvertisementCost+boostercost+serviceCost));
				
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
