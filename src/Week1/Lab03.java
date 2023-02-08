package Week1;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        double subTotal, gratuityRate, gratuity, total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the subtotal and gratuity rate: ");
        subTotal = scan.nextInt();
        gratuityRate = scan.nextInt();
        gratuity = gratuityRate / subTotal;
        total += subTotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
