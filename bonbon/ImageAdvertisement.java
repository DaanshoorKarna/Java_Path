package bonbon;

public class ImageAdvertisement extends Advertisement{
	
	private int inches;
	
	public ImageAdvertisement(int advertisementId, String priority,int noOfDays,String clientName,int inches){
		super(advertisementId,priority,noOfDays,clientName);
		this.inches=inches;
	}
	
	 public void setInches(int inches){
   	  this.inches=inches;
     }
     
     public int getInches(){
   	  return inches;
     }
	

	     public float calculateAdvertisementCharge(float baseCost){
	    	 return baseCost;
	     }
	
}
