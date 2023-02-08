package Week1;

import java.util.Scanner;
public class Lab05{
    public static void main(String[] args){
        int Computer;
        int user;
        String status;
        String[] options = {"Scissor","Rock","Paper"};
        System.out.print("scissor (0), rock (1), paper(2): ");
        Scanner input = new Scanner(System.in);
        user = input.nextInt();
        Computer = (int)(Math.random()*3);
        if(user==Computer)
        {
            status=" too. It is a draw.";
        }
        else if(user==0 && Computer==1 || user==1 && Computer==2 || user==2 && Computer==0)
            status=". You lose.";
        else status=". You won.";
        System.out.println("The computer is "+options[Computer]+". You are "+options[user]+status);
    }
}