import java.util.Scanner;

public class InvoiceTest {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("***WELCOME TO THE HARDWARE STORE***");
			System.out.print("Enter the Part Number: ");
			String pno = sc.nextLine();
			System.out.print("Enter the Part Description: ");
			String pd = sc.nextLine();
			System.out.print("Enter the Quantity: ");
			int quant = sc.nextInt();

			System.out.println("Enter the Price");
			double price = sc.nextDouble();

			if (quant < 0) {
				quant = 0;
			}
			if (price < 0) {
				price = 0.0;
			}
			Invoice i1 = new Invoice(pno, pd, quant, price);
			double totalBill = i1.calculateInvoiceAmount(quant, price);
			
			System.out.println("The Total Bill: " + totalBill);

		}

}
