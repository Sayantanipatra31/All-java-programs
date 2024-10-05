import java.util.*;
public class pivotindex {
    public static void main(String[] args) {
       int [] nums={1,3,1,7};
       int [] query={1,3,2,4};
       ArrayList<Integer> a1 =new ArrayList<>();
       int x=1,count=0;
       for(int i=0;i<query.length;i++)
       {
         for(int j=i;j<nums.length;j++)
         {
            if(nums[j]==x)
            {
                count++;
            
            if(count==query[i])
            {
                a1.add(j);
            }
            else{
                a1.add(-1);
            }
        }
         }
        }
         System.out.println(a1);
    }
}
