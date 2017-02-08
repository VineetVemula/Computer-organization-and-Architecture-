package ieee;
import java.util.*;
public class Ieee {
    static String val = "";
    private static String floatToBinaryString( double n )
    {
        while (val.length()<23)
        {
            double r = n * 2;
            if( r >= 1 )
            {
                val += "1";
                n = r - 1;
            }
         else
         {
            val += "0";
            n = r;
         }
        }
       return val;
    }
    public static void main(String[] args) {
       int s,e,be=0;
       float f1=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter float number");
       float f = sc.nextFloat();
       f1=f;
       if(f<0){
            f1=Math.abs(f);
            s=1;
       }
       else s=0;
       int no = (int)f1;
       float dec = f1-no;
       String x = Integer.toBinaryString(no);
       System.out.println("no=" +no);
       System.out.println("dec="+dec);
       System.out.println("x="+x);
       String x1=floatToBinaryString(dec);
       System.out.println("x1="+x1);
       e=x.length();
       for(int i=0;i<x.length();i++)
       {
           if(x.charAt(i)=='0')
               e--;
           else{
               e--;
               break;
           }
       }
       if(e!=0)
       {
         System.out.println("e=" +(e));
         be=e+127;
       System.out.println("Be = " + be);
       }
      
       if(e==0)
       {
           e=0;
          for(int j=0;j<x1.length();j++)
          {
              if(x1.charAt(j)=='1'){
                  e++;
              break;
              }
              else e++;        
          }
          System.out.println("e=" +(-e));
          be=e+127;
          System.out.println("Be = " + be);
          
          }
          String y = Integer.toBinaryString(be);
          System.out.println(y);
       
    }
}
