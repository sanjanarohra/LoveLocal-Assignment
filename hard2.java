import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hard2 
{

    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int i = 0;
        
        // Finding the longest palindrome suffix
        for (int j = str.length()-1 - 1; j >= 0; j--) 
            if (str.charAt(i) == str.charAt(j)) 
                i++;
        
        if(i!=str.length())
        {
            StringBuilder prefix = new StringBuilder(str.substring(i));
            prefix.reverse();
            str = prefix.toString() +str;
        }
        
        System.out.println(str);       
    }    
}
