import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start, int end){
    start = start;
    end = end;
    current = start;
  }

  public void reset(){  }
  public int length(){  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){    }

}
