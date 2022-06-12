//Practical Question - 8

public class PracQues8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Coffee");
        StringBuilder stbr = new StringBuilder("Hello this is Java");
        System.out.println("Original String : " + stbr);
        stbr.setCharAt(14, 'L'); // change the char
        System.out.println("After using setCharAt(14,'L') : " + stbr);
        stbr.append(true); // ret
        System.out.println("After using append() " + stbr);
        System.out.println("Original length : " + sb.length() + " string :" + sb);
        sb.setLength(4);
        System.out.println("After using setLength(4) length : " + sb.length() + " string :" + sb);
        sb.insert(1, 'r');
        System.out.println("After using insert(1,'r') " + sb);
        String str1 = "AMAN", test = "AMAN";
        String str2 = " KUMAR";
        System.out.println(str1.equals(test)); // returns true
        System.out.println(str1.equals(str2)); // returns false
        System.out.println(str1.concat(str2));

    }
}