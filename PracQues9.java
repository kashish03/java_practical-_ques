//Practical Question - 9

import java.util.Scanner;
class Distance{
    int feet, inches;
    void getDistance(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }
    void showDistance()
    {
        System.out.println("Distance in feet = " + feet);
        System.out.println("Distance in inches = " + inches);
    }
}
public class PracQues9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of feet :");
        int a = sc.nextInt();
        System.out.println("Enter the value of inches :");
        int b = sc.nextInt();
        Distance obj = new Distance();
        obj.getDistance(a, b);
        obj.showDistance();
        sc.close();
    }
}