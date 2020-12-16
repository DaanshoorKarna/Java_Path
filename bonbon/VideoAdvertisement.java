package bonbon;

public class VideoAdvertisement extends Advertisement {

	    private int duration;
	    
	    public void setDuration(int duration){
	     	  this.duration=duration;
	       }
	       
	       public int getDuration(){
	     	  return duration;
	       }
	       
	       public VideoAdvertisement(int advertisementId, String priority,int noOfDays,String clientName,int duration){
		    	  super(advertisementId, priority,noOfDays,clientName);
	    	      this.duration=duration;
	       }
	  	
	public float calculateAdvertisementCharge(float baseCost){
		return baseCost;
	}
}
