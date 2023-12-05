import java.io.*;
public class easy1
{
    public static void main(String[]args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String s = br.readLine();
        s = s.trim();
        int i = s.length()-1;
        int count=0;
        while(i>=0 && s.charAt(i)!=' ')
        {
            i--;
            count++;
        }
        System.out.println(count);
    }   
}
