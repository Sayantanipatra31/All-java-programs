public class coins {
   public static void main(String[]args)throws Exception 
   {
    int num[] ={1,2,3};
    int min_change=1;
    int n= num.length;
    int i,j,t;
    for (i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(num[j]>num[j+1])
            {
               t=num[j];
               num[j]=num[j+1];
               num[j+1]=t;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        System.out.println(num[i]);
    }
    for(i=0;i<n;i++)
    {
      if(num[i]<=min_change)
      {
        min_change=min_change+num[i];
      }
      else
      {
        break;
      }
    }
    System.out.println(min_change);
   }
}
