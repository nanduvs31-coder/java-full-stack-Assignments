package Assignment1;
import java.util.Scanner;
public class GroceryBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the customer name : ");
	String name = sc.nextLine();
	System.out.println("Enter the number of Item : ");
	int items= sc.nextInt();
	sc.nextLine();
	String itemName[] = new String[items];
	int itemQuantity[] = new int[items];
	double itemPrice[] = new double[items];
	for(int i = 0;i < items;i++) {
		System.out.println("Enter the item " + ( i+1 ) +" name :");
		itemName[i]=sc.nextLine();
		do {
		System.out.println("Enter the item Quantity");
		itemQuantity[i] = sc.nextInt();
		if(itemQuantity[i] <=0) {
			System.out.println("The Quantity must be greater than Zero");
		}
		}while(itemQuantity[i] <= 0);
		do {
		System.out.println("Enter the item price");
		itemPrice[i] = sc.nextDouble();
		sc.nextLine();
		if(itemPrice[i] <= 0) {
			System.out.println("The price must be greater than zero!");
		}
		}while(itemPrice[i] <= 0);
		
		
	}
	
	double itemTotal[] = new double[items];
	for(int i =0 ; i < items;i++) {
		itemTotal[i] = (itemQuantity[i] * itemPrice[i]);
	}
	double subTotal = 0;
	for (int i = 0; i < items;i++) {
		subTotal = subTotal+itemTotal[i];
	}
	
	double discountPercentage;
	if (subTotal <1000) {
		discountPercentage = 0;
	}
	else if (subTotal < 5000) {
		discountPercentage = 5;
	}
	else if(subTotal <10000) {
		discountPercentage = 10;
	}
	else  {
		discountPercentage=15;
	}
	
	double discountAmount = ( subTotal * discountPercentage/100);
	double amountAfterDiscount = subTotal - discountAmount;
	double gst = (amountAfterDiscount * 18/100 );
	double finalAmount = amountAfterDiscount + gst ;
	
	System.out.println("==========================");
	System.out.println();
	System.out.println("      GROCERRY BILL      ");
	System.out.println();
	System.out.println("==========================");
	System.out.println();
	System.out.println("Customer Name : " + name);
	System.out.println();
	System.out.println(" item    quantity    price   Total");
	System.out.println("------------------------");
	for(int i = 0; i < items; i++) {
		System.out.println(itemName[i] + "      "+ itemQuantity[i] + "     "+ itemPrice[i]+ "      " + itemTotal[i] );
		System.out.println();
	}
	System.out.println("------------------------");
	
	System.out.println("subtotal : "+ subTotal);
	System.out.println("Discount ("+discountPercentage+") : " +discountAmount);
	System.out.println("Amount After Discount : " + amountAfterDiscount);
	System.out.println("GST(18%) : "+ gst);
    System.out.println();
    System.out.println("------------------------");
    System.out.println();
    System.out.println("Final payable Amount: "+ finalAmount);
    System.out.println();
    System.out.println("==========================");
    System.out.println();
    System.out.println("Thank you for Shopping!");
    
	
}}
