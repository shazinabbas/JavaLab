package week2;
import java.util.*;

public class Task3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number, negativeCount = 0, positiveCount = 0, zeroCount = 0;
        char c;
        while(true)
        {
            System.out.println("Enter any number");

            number = scan.nextInt();
            if(number > 0)
                positiveCount++;
            else if (number < 0)
                negativeCount++;
            else
                zeroCount++;

            System.out.println("Do you want to continue: Y/n");
            c = scan.next().charAt(0);
            if(c == 'n' || c == 'N')
                break;
        }
        System.out.println("Positive numbers = "+ positiveCount);
        System.out.println("Negative numbers = "+ negativeCount);
        System.out.println("Zeroes = "+ zeroCount);


    }
}
