package javaapplication7;

import java.util.*;

public class JavaApplication7 {

    public static void main(String[] args) {
        
    Scanner t = new Scanner(System.in);
    System.out.println("enter the code");
    String s= t.next();
   
    int n1 = Character.getNumericValue(s.charAt(0));
    int n2 = Character.getNumericValue(s.charAt(1));

    int n3 = Character.getNumericValue(s.charAt(2));
    int n4 =  Character.getNumericValue(s.charAt(3));
    int x1 = n1 +n2+ n4;
    int x2 = n1 +n3+ n4;
    int x3 = n2 +n3+ n4;
    int p1,p2,p3;
    if(x1== 1|| x1== 3)
       p1=1;
    else p1=0;
    if(x2== 1|| x2== 3)
       p2=1;
    else p2=0;
    if(x3== 1|| x3== 3)
       p3=1;
    else p3=0;
    
    String e = "";
    
    e += (char)(p1+48);
    e += (char)(p2+48);
    e += (char)(n1+48);
    e += (char)(p3+48);
    e += (char)(n2+48);
    e += (char)(n3+48);
    e += (char)(n4+48);
    
    
    System.out.println("the hamming code is" + e);
    }
}
