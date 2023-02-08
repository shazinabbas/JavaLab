package week2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number, reversed = 0;
        System.out.println("Enter a number: ");
        number = input.nextInt();
        while(number!=0)
        {
            int remainder = number % 10;
            reversed = reversed * 10 +remainder;
            number /= 10;
        }

        System.out.println("The reversed number is: "+ reversed);

    }
}
