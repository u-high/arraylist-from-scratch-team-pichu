
public class AArrayRunner
{
  public static void main(String args[])
  {
    int[] ray = {7,4,6,8,91,23};
    AArrayList obj = new AArrayList(ray);
    
    System.out.println(obj.get(2));
    obj.add(66);
    System.out.println(obj.get(ray.length));
    obj.add(67);
    System.out.println(obj.get(ray.length+1));
    obj.set(0,55);
    System.out.println(obj.get(0));
    System.out.println(obj.toString());
  }
}