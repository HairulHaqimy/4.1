import java.util.Scanner;

public class Lenovo extends Laptop2 {
	Scanner s = new Scanner(System.in);
	    
	String brand;

	 String colour;
	 double price,totalprice;
	 int quantity,storage;
		
	
	    
	Lenovo(){
	this.brand = "Lenovo";
	
	System.out.print("Please enter the laptop brand(Asus/Lenovo): ");
	this.brand = s.nextLine();
	
	System.out.print("Please enter the laptop colour(black / silver): ");
	this.colour = s.nextLine();
	
	System.out.print("Please enter the storage(16/8): ");
	this.storage = s.nextInt();
	
	 if (brand.equalsIgnoreCase("Lenovo")) {
		if (colour.equalsIgnoreCase("black")) {
			if (storage == 16) {
				this.price = 2800;
			}
			else if (storage == 8) {
				this.price = 2300;
			}
		}
		else if (colour.equalsIgnoreCase("silver")) {
			if (storage == 16) {
				this.price = 2800;
			}
			else if (storage == 8) {
				this.price = 2300;
			}
		}
	}
	System.out.print("Please enter the quantity: ");
	this.quantity = s.nextInt();
	this.totalprice = this.price * this.quantity;
	System.out.println();
}
		
		//Getter
		public String getbrand() {
			return this.brand;
		}
		
		public String getcolour() {
			return this.colour;
		}
		
		public int getquantity() {
			return this.quantity;
		}
		
		public int getstorage() {
			return this.storage;
		}
		
		public double getprice() {
			return this.price;
		}
		
		public double gettotalprice() {
			return this.price*this.quantity;
		}

}
