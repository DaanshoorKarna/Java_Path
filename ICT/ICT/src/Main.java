import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String fileName;
		List<ElectricityBill> billList = new ArrayList<ElectricityBill>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name:");
		fileName = sc.nextLine();
		ElectricityBoard obj = new ElectricityBoard();
		billList = obj.generateBill(fileName);
		for(int i = 0; i < billList.size(); i++) {
			System.out.println(billList.get(i).getConsumerNumber() + "\t" + billList.get(i).getConsumerName() + "\t" + billList.get(i).getConsumerAddress() + "\t" + billList.get(i).getUnitsConsumed() + "\t" + billList.get(i).getBillAmount());
		}
		obj.addBill(billList);
		sc.close();
	}
}