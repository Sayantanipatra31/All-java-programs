//thread creation using thread class
class Mythread1 extends Thread{
    public void run()
    {
        int i=0;
        while(i<4){
        System.out.println("my thread1 is running");
        i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run()
    {
        int i=0;
        while(i<4)
        {
            System.out.println("my thread2 is running");
            i++;
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        Mythread1 t1= new Mythread1();
        Mythread2 t2= new Mythread2();
        t1.start();
        t2.start();
        System.out.println("my bad it stopped");
    }
}
