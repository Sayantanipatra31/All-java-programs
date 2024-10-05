import java.util.ArrayList;
public class smallest_difference {

    static void smallestDifference(int a1[], int a2[])
    {
        int a=a1.length;
        int b=a2.length;
        ArrayList<Integer> result= new ArrayList<>();
       int diff=Integer.MAX_VALUE;
       int i,j=0;
       for(i=0;i<a;i++)
       {
        for(j=0;j<b;j++)
        {   int d=Math.abs(a1[i]-a2[j]);
            if(d<diff)
            {
                diff=d;
                if(diff<=3)
                {
                    result.add(a1[i]);
                    result.add(a2[j]);
                }
            }
        }
       }
       System.out.println(result);
       System.out.println(diff);
    }
    public static void main(String[] args) {
    int arrayOne[] = {-1, 5, 10, 20, 3};
    int arrayTwo[] = {26, 134, 135, 15, 17};
    smallestDifference(arrayOne,arrayTwo);
    }
}
