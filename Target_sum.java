import java.util.ArrayList;
import java.util.Scanner;
public class Target_sum {

    static void twoNumberSum(int a[],int target)
    {
        ArrayList<Integer> b= new ArrayList <>();
      int n=a.length;
      //System.out.println(n);
      int i,j;
       for( i=0;i<n;i++)
       {
        for(j=i+1;j<n;j++){

         if ((a[i]+a[j])==target){
            b.add(a[i]);
            b.add(a[j]);
            
            }

         }
       }
     System.out.println(b);
       
    }

     

    public static void main(String[]args)
    {
        int a[]={3,5,-4,8,11,1,-1,6};
        System.out.println("enter target sum");
        @SuppressWarnings("resource")
        Scanner myObj= new Scanner(System.in);
        int input= myObj.nextInt();
        twoNumberSum(a,input);


    }
}