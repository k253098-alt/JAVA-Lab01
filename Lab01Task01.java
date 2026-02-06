package Lab01Task01;
import java.util.Scanner;

public class Lab01Task01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float subTotal = 0;
        char choice;

        System.out.println("Enter items(Name and Price)");
        do{
            System.out.println("Item Name: ");
            String itemName = sc.next();
            System.out.println("Item Price: ");
            float itemPrice = sc.nextFloat();
            subTotal += itemPrice;
            System.out.println("Add more items y/n?");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        float discountPercent = 10;
        float discount = subTotal * discountPercent/100;
        float totalBeforeTax = subTotal - discount;
        float salesTaxPercent = 5;
        float salesTax = totalBeforeTax * salesTaxPercent/100;
        float invoiceTotal = totalBeforeTax + salesTax;

        System.out.printf("SubTotal:             $%.2f\n",subTotal);
        System.out.printf("Discount percent:     $%.2f\n",discountPercent);
        System.out.printf("Discount:             $%.2f\n",discount);
        System.out.printf("Sales Tax:            $%.2f\n",salesTaxPercent);
        System.out.printf("Sales Tax percent:    $%.2f\n",salesTaxPercent);
        System.out.printf("Invoice total:        $%.2f\n",invoiceTotal);

    }

}

