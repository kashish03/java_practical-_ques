//Practical Question - 11

import java.util.Scanner;
public class PracQues11 {
    public static void tConvo(int a)
    {
        System.out.println("Type converted to int - " + a);
    }
    public static void tConvo(double a)
    {
        System.out.println("Type converted to double - " + a);
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0);
        tConvo(ch);
        System.out.println("Enter an integer :");
        int x = sc.nextInt();
        tConvo(x);
        System.out.println("Enter a float :");
        float y = sc.nextFloat();
        tConvo(y);
        sc.close();
    }
}

