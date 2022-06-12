//Practical Question - 6

import java.util.Scanner;

public class PracQues6{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check :");
        int num = sc.nextInt();
        int m = 0, flag = 0;
        m = num / 2;
        if (num == 0 || num == 1) 
        {
            System.out.println(num + " is not a prime number");
        } 
        else 
        {
            for (int i = 2; i <= m; i++) 
            {
                if (num % i == 0) 
                {
                    System.out.println(num + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) 
            {
                System.out.println(num + " is a prime number");
            }
        }
        sc.close();
    }

}
