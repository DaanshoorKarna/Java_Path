public class ElectricityBill {
	private String consumerNumber;
	private String consumerName;
	private String consumerAddress;
	private int unitsConsumed;
	private double billAmount;
	
	public String getConsumerNumber() {
		return this.consumerNumber;
	}
	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public String getConsumerName() {
		return this.consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getConsumerAddress() {
		return this.consumerAddress;
	}
	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}
	public int getUnitsConsumed() {
		return this.unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public double getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public void calculateBillAmount() {
		if(this.unitsConsumed <= 100) {
			this.billAmount = 0;
		} else if(this.unitsConsumed > 100 && this.unitsConsumed <= 300) {
			this.billAmount = (this.unitsConsumed - 100) * 1.5;
		} else if(this.unitsConsumed > 300 && this.unitsConsumed <= 600) {
			this.billAmount = 200 * 1.5 + (this.unitsConsumed - 300) * 3.5;
		} else if(this.unitsConsumed > 600 && this.unitsConsumed <= 1000) {
			this.billAmount = 200 * 1.5 + 300 * 3.5 + (this.unitsConsumed - 600) * 5.5;
		} else {
			this.billAmount = 200 * 1.5 + 300 * 3.5 + 400 * 5.5 + (this.unitsConsumed - 1000) * 7.5;
		}
	}
}