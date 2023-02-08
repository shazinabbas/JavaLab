package Week1;

import java.util.Scanner;
public class Lab04 {
    public static void main(String[] args) {
        int number,sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        number = scan.nextInt();
        if(number < 0 || number > 1000)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        while(number > 0)
        {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of digits is "+ sum);
    }
}