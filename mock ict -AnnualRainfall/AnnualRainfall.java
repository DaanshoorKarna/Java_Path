public class AnnualRainfall {
	//Variables
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;
	
	public int getCityPincode() {
		return this.cityPincode;
	}
	public void setCityPincode(int cityPincode) {
		this.cityPincode = cityPincode;
	}
	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getAverageAnnualRainfall() {
		return this.averageAnnualRainfall;
	}
	public void setAverageAnnualRainfall(double averageAnnualRainfall) {
		this.averageAnnualRainfall = averageAnnualRainfall;
	}
	
	public void calculateAverageAnnualRainfall (double monthlyRainfall[]) {
		double total = 0, average = 0;
		for(int i = 0; i < 12; i++) {
			total+= monthlyRainfall[i];
		}
		average = total / 12;
		setAverageAnnualRainfall(average);
	}
}