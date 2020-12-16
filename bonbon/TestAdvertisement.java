package bonbon;

public class TestAdvertisement extends Advertisement {

	private int noOfCharacters;
	
	public TestAdvertisement(int advertisementId, String priority,int noOfDays,String clientName,int noOfCharacters){
  	  super(advertisementId, priority,noOfDays,clientName);
  	  this.noOfCharacters=noOfCharacters;
		
	}
	
	  public void setNoOfCharacters(int noOfCharacters){
     	  this.noOfCharacters=noOfCharacters;
       }
       
       public int getNoOfCharacters(){
     	  return noOfCharacters;
       }
       
       public float calculateAdvertisementCharge(float baseCost){
   		return baseCost;
   	}
}
