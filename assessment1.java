import java.util.*;

public class assessment1 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("---Welcome to the Pronob shop---");
        System.out.print("Enter Product Name:");
        String name =in.nextLine();
        System.out.print("Enter Unit Price:");
        double unit_price =in.nextDouble();
        System.out.print("Enter Quantity:");
        int quantity=in.nextInt();
        double discountRate=0.15;
         double subtotal=unit_price*quantity;
         double discount_amount=subtotal*discountRate;
         double finalPrice=subtotal - discount_amount;
         int total = (int) Math.floor(finalPrice);
        System.out.println("---Final Receipt---");
        System.out.println("Item:"+name);
        System.out.printf("Subtotal:$%.2f\n",subtotal);
        System.out.printf("Discount Applied:$%.4f$\n",discount_amount);
        System.out.println("Total(Rounded Down):$"+total);
        System.out.println("---------------------------");



    }
}
