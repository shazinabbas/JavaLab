package Week1;

import java.util.Scanner;
public class Lab06{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x,y,dist;
        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        dist = Math.pow(((x*x)+(y*y)),0.5);
        if(dist>10)
            System.out.println("Point ("+x+", "+y+") is not in the circle.");
        else System.out.println("Point ("+x+", "+y+") is in the circle.");
    }
}