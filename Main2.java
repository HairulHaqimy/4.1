
public class Main2 {

	public static void main(String[] args) {
		
				Asus a = new Asus();
				System.out.println("Laptop Details:");
				System.out.println("Brand: "+ a.brand);
				System.out.println("Colour: "+ a.colour);
				System.out.println("Storage: "+ a.storage+"GB");
				System.out.printf("Price per unit: RM%.2f %n",a.price);
				System.out.println("Number of quantity: " + a.quantity);
				System.out.printf("Total Price: RM%.2f %n",a.totalprice);
				
				System.out.println();
				
				Lenovo b = new Lenovo ();
				System.out.println("Laptop Details:");
				System.out.println("Brand: "+ b.brand);
				System.out.println("Colour: "+ b.colour);
				System.out.println("Storage: "+ b.storage+"GB");
				System.out.printf("Price per unit: RM%.2f %n",b.price);
				System.out.println("Number of quantity: " + b.quantity);
				System.out.printf("Total Price: RM%.2f %n",b.totalprice);

	}

}