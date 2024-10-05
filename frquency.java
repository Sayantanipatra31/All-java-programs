import java.util.*;
class frequency {
    public static void main(String[] args) {
        String str="abcdefghaabca";
        int[] freq = new int[str.length()];   
      char string[] = str.toCharArray();    
            Arrays.sort(string);
        for(int i = 0; i <str.length(); i++) {    
            freq[i] = 1;    
            for(int j = i+1; j <str.length(); j++) {    
                if(string[i] == string[j]) {    
                    freq[i]++; 
                }
            }
        }
       
        for(int j=0;j<freq.length;j++)
        {
            if(freq[j]==2)
            {
                System.out.print(string[j]);
            }
        }
    }
}
