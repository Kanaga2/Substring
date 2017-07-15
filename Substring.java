# Substring
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Comp {
  
  public static void main(String args[])throws IOException
  
  {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int flag=0;
    String a=br.readLine();
    int a1=a.length();
    String b=br.readLine();
    for(int i=0;i<=a1-2;i++)
    {
      if(b.contains(a.substring(i,i+2)))
      {
        flag=1;
      }
    }
    if(flag==1)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("No sub strings present");
    }
    
  }
}
