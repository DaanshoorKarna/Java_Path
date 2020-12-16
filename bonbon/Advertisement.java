package bonbon;

public abstract class Advertisement {

	      protected int advertisementId;
	      protected String priority,clientName;
	      protected int noOfDays;
	      
	      public void setAdvertisementId(int advertisementId){
	    	  this.advertisementId=advertisementId;
	      }
	      
	      public int getAdvertisementId(){
	    	  return advertisementId;
	      }
	      
	      public void setPriority(String priority){
	    	  this.priority=priority;
	      }
	      
	      public String getPriority(){
	    	  return priority;
	      }
	      
	      public void setClientName(String clientName){
	    	  this.clientName=clientName;
	      }
	      
	      public String getClientName(){
	    	  return clientName;
	      }
	      public void setNoOfDays(int noOfDays){
	    	  this.noOfDays=noOfDays;
	      }
	      
	      public int NoOfDays(){
	    	  return noOfDays;
	      }
	      
	      public Advertisement(int advertisementId, String priority,int noOfDays,String clientName){
	    	  super();
	    	  this.advertisementId=advertisementId;
	    	  this.priority=priority;
	    	  this.clientName=clientName;
	    	  this.noOfDays=noOfDays;
	      }
	      
	      public abstract float calculateAdvertisementCharge(float baseCost);
	      
}
