//Practical Question - 4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class PracQues4 {
        public static void main(String[] args) {
                List<int[]> values = new ArrayList<int[]>();
                values.add(new int[] { 1, 2, 3 });
                values.add(new int[] { 4, 5, 6 });
                values.add(new int[] { 7, 8 });
                // print data of each row
                for (int[] eachRow : values) {
                        System.out.println(Arrays.toString(eachRow));
                }
                // adding new row
                values.add(new int[] { 9, 10 });
                System.out.println("After adding a new row.");
                // print data of each row
                for (int[] eachRow : values) {
                        System.out.println(Arrays.toString(eachRow));
                }
        }
}