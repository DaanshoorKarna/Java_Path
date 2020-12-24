import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AnnualRainfall obj;
		List<AnnualRainfall> resultSet = new ArrayList<AnnualRainfall>();
		List<AnnualRainfall> maxRainfallCities;
		String path;
		Scanner sc = new Scanner(System.in);
		RainfallReport driverObj = new RainfallReport();
		path = sc.nextLine();
		resultSet = driverObj.generateRainfallReport(path);
		for(int i = 0; i < resultSet.size(); i++) {
			obj = resultSet.get(i);
			System.out.print(obj.getCityName());
			System.out.print("\t" + obj.getCityPincode());
			System.out.println("\t" + obj.getAverageAnnualRainfall());
		}
		maxRainfallCities = driverObj.findMaximumRainfallCities();
		for(int i = 0; i < maxRainfallCities.size(); i++) {
			System.out.println(maxRainfallCities.get(i).getCityName() + " " + maxRainfallCities.get(i).getCityPincode() + " " + maxRainfallCities.get(i).getAverageAnnualRainfall());
		}
		sc.close();
	}
}