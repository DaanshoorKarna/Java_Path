import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectricityBoard {
	public List<ElectricityBill>generateBill(String filePath) {
		try {
			Scanner sc = new Scanner(new File(filePath));
			List<ElectricityBill> consumerList = new ArrayList<ElectricityBill>();
			while(sc.hasNextLine()) {
				String tokens[] = sc.nextLine().split(",");
				//System.out.println(tokens[1]);
				try {
					if(validate(tokens[0])) {
						ElectricityBill customer = new ElectricityBill();
						customer.setConsumerNumber(tokens[0]);
						customer.setConsumerName(tokens[1]);
						customer.setConsumerAddress(tokens[2]);
						customer.setUnitsConsumed(Integer.parseInt(tokens[3]));
						customer.calculateBillAmount();
						consumerList.add(customer);
					}
				} catch (InvalidConsumerNumberException e) {
					//System.out.println(e.getMessage());
				}
			}
			sc.close();
			return consumerList;
		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
			return null;
		} 
	}
	
	public void addBill(List<ElectricityBill>billList) {
		try {
			DBHandler dbDriver = new DBHandler();
			Connection con = dbDriver.establishConnection();
			for(int i = 0; i < billList.size(); i++) {
				String query = "INSERT INTO ElectricityBill VALUES (?,?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, billList.get(i).getConsumerNumber());
				stmt.setString(2, billList.get(i).getConsumerName());
				stmt.setString(3, billList.get(i).getConsumerAddress());
				stmt.setInt(4, billList.get(i).getUnitsConsumed());
				stmt.setFloat(5, (float)billList.get(i).getBillAmount());
				stmt.executeUpdate();
			}
		} catch (Exception e) {
			
		}
	}
	boolean validate(String consumerNumber) throws InvalidConsumerNumberException {
		boolean result;
		if(consumerNumber.matches("0[0-9]{9}")) {
			result = true;
		} else {
			throw new InvalidConsumerNumberException("Invalid Consumer Number");
		}
		return result;
	}
}