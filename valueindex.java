import java.util.*;
public class valueindex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int n=sc.nextInt();
        ArrayList<Integer> a1 =new ArrayList<>(n);
        int ele;
        for(int i=0;i<n;i++)
        {
            ele = sc.nextInt();
            a1.add(ele);
        }
        System.out.println("before insertion");
        for(int i=0;i<n;i++)
        {
            System.out.println(a1.get(i));
        }
        System.out.println("enter pos and value");
        int pos=sc.nextInt();
        int val=sc.nextInt();
        a1.add(pos-1,val);
        System.out.println("after insertion");
        for(int i=0;i<=n;i++)
        {
            System.out.println(a1.get(i));
        }
        sc.close();
    }
}