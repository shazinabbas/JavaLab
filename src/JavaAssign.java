import java.util.Scanner;
public class JavaAssign {
    public static void main(String[] args)
    {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if(a%2==0 && a%3==0)
            System.out.println("Divisible by both 2 and 3");
        if(a%2==0 ^ a%3==0)
            System.out.println("Divisible by both 2 or 3 but not both");
        if(a%2==0 || a%3==0)
            System.out.println("Divisible by both 2 or 3");

    }
}
 