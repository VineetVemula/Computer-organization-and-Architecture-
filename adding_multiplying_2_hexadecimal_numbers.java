

import java.util.*;


public class JavaApplication6 {

    
    public static void main(String[] args) {
        
        
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the two hex numbers");
        String n= t.next();
        String m= t.next();
        int a1 = Integer.parseInt(n,16);
        int a2 = Integer.parseInt(m,16);
        System.out.println("Enter 1.Addition 2.Multiplication");
        int ch;
        ch= t.nextInt();
        switch(ch)
        {
            case 1: 
                int r = a1+a2;
                System.out.println("The addition is : "+ Integer.toHexString(r));
                break;  
            case 2:
                int d = a1 * a2;
                 System.out.println("The multiplication is : "+ Integer.toHexString(d));
                break;  
                
        }
  }
}
