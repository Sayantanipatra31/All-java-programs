import java.util.Scanner;
public class tandem_bicycle{
    static void Tandem_speed( String input){
    int [] a = {1, 2, 1, 9, 12, 3};
    int [] b = {3, 3, 4, 6, 1, 2};
        if(input.equals("fastest"))
        {
            int sum=0;
            for(int i=0,j=0;i<a.length&&j<b.length;i++,j++)
            {
                if(a[i]>b[j])
                {
                    sum+=a[i];
                }
                else{
                    sum+=b[j];
                }
            }
            System.out.print("maximum");
            System.out.println(sum);
        }
        else{
            int sum1=0;
            for(int i=0,j=0;i<a.length&&j<b.length;i++,j++)
            {
                if(a[i]<b[j])
                {
                    sum1+=a[i];
                }
                else{
                    sum1+=b[j];
                }
            }
            System.out.print("minimum");
            System.out.println(sum1);
        }
    }
    public static void main(String[]args){
        System.out.println("enter fastest or slowest");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String user_input= input.nextLine();
        Tandem_speed(user_input);
    }
    
}