// Thread practise set 
class Myth1 extends Thread
{
    public void run(){
    int i=0;
    while(i<300){
        System.out.println("Welcome");
        i++;
    }
    }
}// close thread1
class Myth2 extends Thread
{
    public void run()
    {
    int i=0;
    while(i<300){
        System.out.println("Good Morning :)");
        i++;
    }
    }
}// close thread2

public class thrprac {
    public static void main(String[] args) {
      Myth1 t1 = new Myth1();
      Myth2 t2 = new Myth2();
      t1.start();
      try
      {
        t1.join();
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      t2.start();
    //   System.out.println(t1.getPriority());
    //   System.out.println(t1.getState());
    }
}
