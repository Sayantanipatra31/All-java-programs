import java.util.Scanner;
public class array1 {
public static void main(String[]args)
{
   System.out.println("2d arrays");
   Scanner sc = new Scanner(System.in);
  //  int [][] arr=new int[2][2];
  //  for(int i=0;i<2;i++)
  //  {
  //   for(int j=0;j<2;j++)
  //   {
  //       arr[i][j]=sc.nextInt();
  //   }
  //  }
  //  System.out.println("print");
  //  for(int i=0;i<2;i++)
  //  {
  //   for(int j=0;j<2;j++)
  //   {
  //     System.out.print(arr[i][j] + " ");
  //   }
  //   System.out.println();
  //   }
  // int sum=0;
  // for(int i=0;i<2;i++)
  // {
  //  for(int j=0;j<2;j++)
  //  {
  //    sum= sum+arr[i][j];
  //  }
  // }
  // System.out.println(sum);
  int [] b = new int[5];
  for (int i=0;i<5;i++)
  {
    b[i]=sc.nextInt();
  }
  System.out.println("reverse");
  for(int i=b.length-1;i>=0;i--)
  {
    System.out.print(b[i]+" ");
  }
    sc.close();
}
}