package week2;

import java.util.Scanner;

public class Task1d {
    public  static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n = scan.nextInt();
        int a = 0, b=1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }


    }
}
