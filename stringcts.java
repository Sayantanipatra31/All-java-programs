import java.util.*;
public  class stringcts
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int c=0;
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)=='I')
        {
            c++;
        }
    }
    if(c<=1)
    {
        c=0;
        System.err.println(c);
    }
    else
    System.err.println(c);
    sc.close();
  }
}