package week2;

import java.util.Scanner;

public class Task2
{
    public  static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n = scan.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b+ " ");
        for (int i = 0; i < n; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
