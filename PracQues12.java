//Practical Question - 12

class Distance {

    public int feet, inches;
    private int metrs, centimetrs;
    public final int kilo = 1000;//final keyword
  
    Distance(int f, int i) {
      metrs = 100;
      centimetrs = 50;
      this.feet = f;
      this.inches = i;
    }
  
    void display() {
      System.out.println("feet       = " + feet);
      System.out.println("inches     = " + inches);
      System.out.println("metres     = " + metrs);
      System.out.println("centimetrs = " + centimetrs);
  
    }
  
    void addDistance(Distance obj) {
      // kilo=1000; //because of final value can't be assigned
      obj.feet = obj.feet + kilo;
      obj.inches = obj.inches + kilo;
  
    }
  }
  
  public class PracQues12 {
  
    public static void main(String args[]) {
  
      Distance d1 = new Distance(10, 20);
      Distance d2 = new Distance(20, 30);
  
      d1.display();
      // System.out.println("metres= "+d1.metrs);
      // metrs can't be accessed because of private access specifier
      // System.out.println("centimetres= "+d1.centimetrs);
      // centimeters can't be accessed because of private access specifier
      d1.addDistance(d2);
      d2.display();
  
    }
  }
