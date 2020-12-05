public interface IntegerSequence{
  boolean hasNext() ;//does the sequence have more elements?
  int next();         //return the current value in the sequence and advances to the next element
  int length();     //returns the total length of the sequence
  void reset();     //start over from the start of the sequence
}
