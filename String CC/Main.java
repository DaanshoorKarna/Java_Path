import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//fill the code
		String str = sc.nextLine();
		if (str.length() != 18){
		    System.out.println(str+" is invalid input");
		}else {
		    String deptCode = str.substring(0,3);
		    String yrPublitn = str.substring(3,7);
		    String noPages = str.substring(7,12);
		    String bokId = str.substring(12,18);
		    String deptName = "";
		    if (deptCode.equals("101") || deptCode.equals("102") || deptCode.equals("103") ){
		        if(deptCode.equals("101")) deptName = "Accoun2ting";
		        if(deptCode.equals("102")) deptName = "Economics";
		        if(deptCode.equals("103")) deptName = "Engineering";
		        
		        
		        
		        int year = Integer.parseInt(yrPublitn);
		        if(year>=1900 && year<=2020){
		            
		            //System.out.println("year "+year);
		            
		            int noP = Integer.parseInt(noPages);
		            if(noP>=10){
		                char bokF = bokId.charAt(0);
		                if(Character.isLetter(bokF) && bokId.substring(0,5).length()==5){
		                    
		                   System.out.println("Department Code: "+deptCode);
		                    System.out.println("Department Name: "+deptName);
		                    System.out.println("Year of Publication: "+yrPublitn);
		                    System.out.println("Number of Pages: "+noPages);
		                    System.out.println("Book Id: "+bokId); 
		                    
		                    //System.out.println("here");
		                    
		                }else{
		                    System.out.println(bokId+" is invalid book id");
		                }
		            }else{
		                System.out.println(noPages+" are invalid pages");
		            }
		        }else{
		            System.out.println(yrPublitn+" is invalid year");
		        }
		        
		    }else{
		        System.out.println(deptCode+" is invalid department code");
		    }
		    
		}
		
	}
}