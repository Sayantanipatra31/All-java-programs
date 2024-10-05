// interface problems
// interface is a group of related methods with empty body
// it is where two devices connect
interface bicycle {
    public int c=10;
 void brake(int decrement);
 void speedup(int increment);
 default void greet()
 {
    System.out.println("good morning");
 }
}
interface horn
{
    
    void applyhorn();
    void applyhorn2();
}
class herobicycle implements bicycle,horn{
    // we can override properties in classes but not in other interfaces and not through objects
    public int c=20;
    // interface functions should be implemented in public
    public void brake(int decrement)
    {
        System.out.println("apply brakes");
    }
  public void speedup(int increment)
 {
    System.out.println("speeding up");
 }
 public void applyhorn()
 {
    System.out.println("peeeeeee");
 }
 public void applyhorn2()
 {
    System.out.println("poooooooo");
 }
}
public class interface1{
    public static void main(String[]args)
    {
        herobicycle b1 = new herobicycle();
        b1.brake(2);
        b1.speedup(5);
        b1.applyhorn();
        b1.applyhorn2();
        System.out.println(b1.c);
        b1.greet();
    }  
}
