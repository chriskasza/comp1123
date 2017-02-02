public interface Incrementable
{
  // Increment the counter once
  public void inc();
  
  // Increment the counter numTimes
  public void inc(int numTimes);
  
  // reset the counter
  public void reset();
}