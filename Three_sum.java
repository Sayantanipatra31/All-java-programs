import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Three_sum {
    static void threeNumberSum(int a[],int target)
    {
        Integer b[]=new Integer[3];
      int n=a.length;
      ArrayList<ArrayList<Integer>> b2= new ArrayList <>();
      //System.out.println(n);
      int i,j,k;
       for( i=0;i<n;i++)
       {
        for(j=i+1;j<n;j++){
            for(k=j+1;k<n;k++){
         if ((a[i]+a[j]+a[k])==target){
            b[0]=a[i];
            b[1]=a[j];
            b[2]=a[k];
            ArrayList<Integer> b1= new ArrayList<Integer>(Arrays.asList(b));
            Collections.sort(b1);
            b2.add(b1);
            }
         }
       }
    }
    System.out.println(b2);
    }
  

     

    public static void main(String[]args)
    {
        int a[]={12,3,1,2,-6,5,-8,6};
        System.out.println("enter target sum");
        Scanner myObj= new Scanner(System.in);
        int input= myObj.nextInt();
        threeNumberSum(a,input);
        myObj.close();

    }
}

