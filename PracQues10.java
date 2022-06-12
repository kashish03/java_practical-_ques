//Practical Question - 10

import java.util.Scanner;
class Distance{
    int feet, inches;
    Distance()
    {
        feet = 0;
        inches = 0;
    }
    Distance(int f, int i)
    {
        feet = f;
        inches = i;
        System.out.println("---------------------------------");
        System.out.println("Constructor called!");
    }
    Distance(Distance clone)
    {
        feet = clone.feet;
        inches = clone.inches;
        System.out.println("---------------------------------");
        System.out.println("Clone Constructor called!");
    }
    void getDistance(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }
    void showDistance()
    {
        System.out.println("Distance in feet = " + feet);
        System.out.println("Distance in inches = " + inches);
        System.out.println("---------------------------------");
    }
} 
public class PracQues10 {
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
        Distance obj1 = new Distance(10, 20);
        obj1.showDistance();
        System.out.println("---------------------------------");
        System.out.println("Object given as reference!");
        Distance obj2 = obj1;
        obj2.showDistance();
        Distance obj3 = new Distance(obj1);
        obj3.showDistance();
        sc.close();
    }
}
