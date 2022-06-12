//Practical Question - 7

import java.util.Scanner;
public class PracQues7 {
    public static void main(String args[])
    {
        int i = 0, sum = 0;
        int val = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        System.out.println("----Enter the numbers----");
        while(i < val)
        {
            int num = sc.nextInt();
            sum = sum + num;
            i++;
        }
        System.out.println("Sum of the entered numbers is " + sum);
        sc.close();
    }
}
