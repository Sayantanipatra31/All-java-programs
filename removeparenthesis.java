// import java.util.*;
// import java.lang.*;
public class removeparenthesis {
    public static void main(String[] args) {
        String ans="";
        String a="(()())(())";
        int count=0;
        String []strarray=null;
        strarray=a.split(" ");
        for(int i=0;i<strarray.length;i++)
        {
            if(strarray[i]=="(")
            {
               if(count==0)
               {
                 ans=ans+"(";
                 count++;
               }
              
            }
            if(strarray[i]==")")
            {
                if(count>0)
                {
                    ans=ans+")";
                    count--;
                }

            }
        }
        System.out.print(ans);

    }
}
