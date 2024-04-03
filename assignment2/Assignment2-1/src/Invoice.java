
public class Invoice {
	private double totalAmount;
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	public Invoice() {
		partNumber = "1SD";
		partDescription = "Screwdriver";
		quantity = 5;
		price = 40.00;
	}

	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateInvoiceAmount(int quantity, double price) {
		this.totalAmount = quantity * price;
		return totalAmount;
	}


}
