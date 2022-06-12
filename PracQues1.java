//Practical Question - 1

public class PracQues1{
    public static void main(String args[]){
        int i = 0, sum = 0;
        while(i < args.length)
        {
            int val = Integer.parseInt(args[i]);
            sum = sum + val;
            i++;
        }

        System.out.println("Sum is " + sum);
    }
}