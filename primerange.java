import java.util.*;
public class primerange
{
     static boolean prime(int n)
    {
        int c=0;
        for(int j=2;j<=n-1;j++)
        {
            if(n%j==0)
            {
              return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(prime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}