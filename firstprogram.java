import java.util.Scanner;
public class firstprogram 
{
    public static void main(String[]args)
    {
        System.out.println("hello world");
        System.out.println("it works");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        int sum=a+a;
        System.out.println(sum);
        sc.close();
        // Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String a1 = sc.nextLine();
        String b="dear name , thanks a lottt!";
        System.out.println(a1.toLowerCase());
        System.out.println(a1.replace(" ","*"));
        String c= b.replace("name","sayan");
        System.out.println((c));
        // sc.close();
    }
}
