import java.util.NoSuchElementException;
public class IntegerTester {
  public static void main(String[] args) {
    IntegerSequence r = new Range(10, 20);
    while (r.hasNext()) {
      System.out.print(r.next());
      if (r.hasNext()) System.out.print( ", " );
    }
    System.out.println();
    IntegerSequence r2 = new Range(10,15);
    while(r2.hasNext()){
      System.out.print(r2.next());
      System.out.print(" " + r2.hasNext());
      if(r2.hasNext()){
          System.out.print( ", " );
      }
    }

      System.out.println();
      IntegerSequence r3 = new Range(3,7);
      System.out.println(r3.next());

      System.out.println(r.length());    //11
      System.out.println(r2.length());   //6
      System.out.println(r2.hasNext());  //false
      System.out.println(r3.hasNext());  //true
      System.out.println(r3.next());     //4
      try {
        r2.next();
      } catch (NoSuchElementException e) {
        System.out.println("There are no NEXT elements!!!");
        e.printStackTrace();
      }
      try {
        IntegerSequence r4 = new Range(9, 4);
      } catch (IllegalArgumentException e) {
        System.out.println("\nStart value is too big!!!");
        e.printStackTrace();
      }
  }
}
