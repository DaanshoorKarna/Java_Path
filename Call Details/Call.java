import java.util.*;

public class Call {
	
	private int callId;
	private long calledNumber;
	private float duration;

	public void setCallId(int callId){
		this.callId=callId;
	}
	public int getCallId(){
		return callId;
	}
	
	public void setCalledNumber(long calledNumber){
		this.calledNumber=calledNumber;
	}
	public long getCalledNumber(){
		return calledNumber;
	}
	public void setDuration(float duration){
		this.duration=duration;
	}
	public float getDuration(){
		return duration;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the call details:");
        String s=sc.nextLine();
        Call c=new Call();
        c.parseData(s);
        System.out.println("Call id: "+c.getCallId());
		System.out.println("Called number: "+c.getCalledNumber());
		System.out.println("Duration: "+c.getDuration());
		// TODO Auto-generated method stub
	    
	}
	
	public void parseData(String callDetails){
		
		StringTokenizer st=new StringTokenizer(callDetails, ":");
        int count=0;
   
        callId = Integer.parseInt(st.nextToken());
        calledNumber = Long.parseLong(st.nextToken());
        duration = Float.parseFloat(st.nextToken());
	}
}
