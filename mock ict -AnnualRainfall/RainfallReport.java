import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RainfallReport {
	public List<AnnualRainfall> generateRainfallReport(String filePath) {
		try {
			Scanner sc = new Scanner(new FileReader(filePath));
			List<AnnualRainfall> cityObjects = new ArrayList<AnnualRainfall>();
			while(sc.hasNextLine()) {
				double[] monthlyRainfall = new double[12];
				String tokens[] = sc.nextLine().split(",");
				try {
					if(validate(tokens[0])) {
						for(int i = 0; i < 12; i++) {
							monthlyRainfall[i] = Double.parseDouble(tokens[i + 2]);
						}
						AnnualRainfall cityObj = new AnnualRainfall();
						cityObj.setCityPincode(Integer.parseInt(tokens[0]));
						cityObj.setCityName(tokens[1]);
						cityObj.calculateAverageAnnualRainfall(monthlyRainfall);
						cityObjects.add(cityObj);
					}
				} catch (InvalidCityPincodeException e) {
					//System.out.println(e.getMessage());
				}
			}
			sc.close();
			return cityObjects;
		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
			return null;
		}
	}
	
	public List<AnnualRainfall> findMaximumRainfallCities() throws ClassNotFoundException, SQLException {
		try {
			List<AnnualRainfall> maxRainfallCities  = new ArrayList<AnnualRainfall>();
			DBHandler dbDriver = new DBHandler();
			Connection con=dbDriver.establishConnection();
			Statement stmt = con.createStatement();
			String query = "select * from AnnualRainfall where average_annual_rainfall = (select max(average_annual_rainfall) from AnnualRainfall)";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int cityPincode = rs.getInt(1);
				String cityName=rs.getString(2);
                double avgAnnualRainfall=rs.getDouble(3);
                AnnualRainfall resultObj = new AnnualRainfall();
                resultObj.setCityName(cityName);
                resultObj.setCityPincode(cityPincode);
                resultObj.setAverageAnnualRainfall(avgAnnualRainfall);
                maxRainfallCities.add(resultObj);
			}
			return maxRainfallCities;
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean validate(String cityPincode) throws InvalidCityPincodeException {
		boolean answer;
		if(cityPincode.matches("[0-9]{5}")) {
			answer = true;
		} else {
			throw new InvalidCityPincodeException("Invalid City Pincode");
		}
		return answer;
	}
}