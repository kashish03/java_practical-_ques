//Practical Question - 18

import java.util.Scanner;
import java.lang.ArithmeticException;
public class PracQues18 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        int c;
        sc.close();
        try
        {
            c = a/b;
            System.out.println("The value of " + a + "/" + b + " = " + c);
        }catch (ArithmeticException e){
            System.out.println("Exception - Not Defined");
        }
    }
}
