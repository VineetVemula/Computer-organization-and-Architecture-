package javaapplication9;
import java.util.*;


public class JavaApplication9
{   
    public static void main(String[] args) 
    {
        String x;
        int ascii;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter string");
        x=t.nextLine();
        char c[]=new char[100];
        c=x.toCharArray();
        for(int i=0;i<c.length;i++)
         {
            ascii=(int)c[i];
            System.out.println("ASCII Value of " + c[i] + " is = " + ascii);
         }
    }
}
