import java.util.Scanner;

public class Laptop2 {
	Scanner s = new Scanner(System.in);
	    
	private String brand,colour;
	private double price;
	private int quantity,storage; 
	
	//Constructor
	Laptop2(){
		
		System.out.print("Please enter the laptop brand(): ");
		this.brand = s.nextLine();
		
		System.out.print("Please enter the laptop colour(): ");
		this.colour = s.nextLine();
		
		System.out.print("Please enter the storage(): ");
		this.storage = s.nextInt(); 
		
		System.out.print("Please enter the quantity(): ");
		this.quantity = s.nextInt();
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
