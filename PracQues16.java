//Practical Question - 16

import java.util.Scanner;
import FibPack.*;

public class PracQues16 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of terms you want to print of Fibonacci Series : ");
        int num = sc.nextInt();
        Fib p1 = new Fib();
        p1.fibonacci(num);
        sc.close();
    }
}
class Fib extends FibPackage{
    void fibonacci(int x){
        if (x == 1)
            System.out.print(num1);
        else if (x == 2)
            System.out.print(num1 + " , " + num2);
        else if (x > 2){
            System.out.print(num1 + " , " + num2 + " , ");
            for(int i=0; i<x-2; i++){
                num3 = num1 + num2;
                if (i == x-3)
                    System.out.print(num3);
                else    
                    System.out.print(num3 + " , ");
                num1 = num2;
                num2 = num3;
            }
        }

    }   

}
