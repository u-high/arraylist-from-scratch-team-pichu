import java.util.*;

public class AArrayList
{
  private int[] ray;
  
  public AArrayList()
  {
    ray = new int[1];
  }
  public AArrayList(int[] array)
  {
    ray = array;
  }
  
  public int get(int index)
  {
    return ray[index];           //i'm in your filez makin the commentz
  }
  
  public void add(int temp)
  {
    int[] tarray = new int[ray.length+1];
    int i = 0;
    for( int item : ray)
    {
      tarray[i++] = item;
    }
    tarray[i] = temp;
    ray = tarray;
  }
  
  public void set(int index, int temp)
  {
    ray[index] = temp;
  }
  
  public String toString()
  {
    return Arrays.toString(ray);    //catz
  }
}
  
