//********************************************************************
//  Die.java     Author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************

public class Die {
  private final int MAX_INT = 6;  // maximum face value

  private int faceValue;  // current value showing on the die

  //-----------------------------------------------------------------
  //  Constructor: Sets the initial face value.
  //-----------------------------------------------------------------
  public Die() {
    faceValue = 1;
  }

  //-----------------------------------------------------------------
  //  Rolls the die and returns the result.
  //-----------------------------------------------------------------
  private int roll() {
    int temp = (int)(Math.random() * MAX) + 1;

    return temp;
  }
  
  public int doubleRoll() {
    faceValue = (roll() + roll()) / 2;
    return faceValue;
  }

  //-----------------------------------------------------------------
  //  Face value mutator.
  //-----------------------------------------------------------------
  public void setFaceValue(int value) {
    faceValue = value;
  }

  //-----------------------------------------------------------------
  //  Face value accessor.
  //-----------------------------------------------------------------
  public int getFaceValue() {
    return faceValue;
  }

  //-----------------------------------------------------------------
  //  Returns a string representation of this die.
  //-----------------------------------------------------------------
  public String toString() {
    String result = Integer.toString(faceValue);

    return result;
  }
}
