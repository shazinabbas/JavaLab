package week2;

import java.util.Scanner;
public class Task1a {
    public static void main(String[] args)
    {
        int rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = scan.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
